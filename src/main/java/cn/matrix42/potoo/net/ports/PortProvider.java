package cn.matrix42.potoo.net.ports;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public interface PortProvider {

    String providerType();

    int next();

}
