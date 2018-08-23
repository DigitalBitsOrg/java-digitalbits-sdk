package io.digitalbits.sdk;

import java.nio.charset.Charset;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Network class is used to specify which DigitalBits network you want to use.
 * Each network has a <code>networkPassphrase</code> which is hashed to
 * every transaction id.
 * There is no default network. You need to specify network when initializing your app by calling
 * {@link Network#use(Network)}, {@link Network#usePublicNetwork()} or {@link Network#useTestNetwork()}.
 */
public class Network {
    private final static String PUBLIC = "Live DigitalBits Network ; March 2018";
    private final static String TESTNET = "Test DigitalBits Network ; December 2017";
    private static Network current;

    private final String networkPassphrase;

    /**
     * Creates a new Network object to represent a network with a given passphrase
     * @param networkPassphrase
     */
    public Network(String networkPassphrase) {
        this.networkPassphrase = checkNotNull(networkPassphrase, "networkPassphrase cannot be null");
    }

    /**
     * Returns network passphrase
     */
    public String getNetworkPassphrase() {
        return networkPassphrase;
    }

    /**
     * Returns network id (SHA-256 hashed <code>networkPassphrase</code>).
     */
    public byte[] getNetworkId() {
        return Util.hash(current.getNetworkPassphrase().getBytes(Charset.forName("UTF-8")));
    }

    /**
     * Returns currently used Network object.
     */
    public static Network current() {
        return current;
    }

    /**
     * Use <code>network</code> as a current network.
     * @param network Network object to set as current network
     */
    public static void use(Network network) {
        current = network;
    }

    /**
     * Use DigitalBits Public Network
     */
    public static void usePublicNetwork() {
        Network.use(new Network(PUBLIC));
    }

    /**
     * Use DigitalBits Test Network.
     */
    public static void useTestNetwork() {
        Network.use(new Network(TESTNET));
    }
}
