package cn.matrix42.potoo.net.ports;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PredefinedPortProvider implements PortProvider {

    private final Iterator<Integer> current;

    public PredefinedPortProvider(Collection<Integer> ports) {
        List<Integer> allPorts = new LinkedList<>(ports);
        this.current = allPorts.iterator();
    }

    public PredefinedPortProvider(Integer ... ports) {
        List<Integer> allPorts = new LinkedList<>();
        Collections.addAll(allPorts, ports);
        this.current = allPorts.iterator();
    }

    @Override
    public synchronized int next() {
        if (!current.hasNext()) {
            throw new RuntimeException("Run out of ports!");
        }
        return current.next();
    }
}
