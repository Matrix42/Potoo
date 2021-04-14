package cn.matrix42.potoo.net.ports;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class EphemeralPortProvider implements PortProvider {

    @Override
    public int next() {
        try {
            final ServerSocket socket = new ServerSocket(0);
            socket.setReuseAddress(false);
            int port = socket.getLocalPort();
            socket.close();
            return port;
        } catch (IOException e) {
            //should not ever happen
            throw new RuntimeException("Could not provide ephemeral port.", e);
        }
    }

    @Override
    public String providerType() {
        return "ephemeral";
    }
}
