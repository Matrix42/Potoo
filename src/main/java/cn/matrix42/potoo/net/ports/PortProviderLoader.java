package cn.matrix42.potoo.net.ports;

import cn.matrix42.potoo.lang.Lists;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

import static cn.matrix42.potoo.lang.Preconditions.checkNotNull;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class PortProviderLoader {

    /**
     *
     * @param portProviderType port provider type
     * @return PortProvider
     * @since 1.0.0
     */
    public PortProvider load(String portProviderType) {
        checkNotNull(portProviderType);
        ServiceLoader<PortProvider> serviceLoader = ServiceLoader.load(PortProvider.class);
        Iterator<PortProvider> iterator =  serviceLoader.iterator();
        List<PortProvider> portProviderList = Lists.newArrayList(iterator);
        for (PortProvider portProvider : portProviderList) {
            if (portProviderType.equals(portProvider.providerType())) {
                return portProvider;
            }
        }
        return null;
    }

}
