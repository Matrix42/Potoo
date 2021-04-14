package cn.matrix42.potoo.net.ports;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class SequencePortProvider implements PortProvider {

    private final AtomicInteger currentPort = new AtomicInteger(26379);

    public SequencePortProvider() {
    }

    public SequencePortProvider(int currentPort) {
        this.currentPort.set(currentPort);
    }

    public void setCurrentPort(int port) {
        currentPort.set(port);
    }

    @Override
    public int next() {
        return currentPort.getAndIncrement();
    }

    @Override
    public String providerType() {
        return "sequence";
    }
}
