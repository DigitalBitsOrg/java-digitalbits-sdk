package io.digitalbits.sdk;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NetworkTest {
    @After
    public void resetNetwork() {
        Network.use(null);
    }

    @Test
    public void testNoDefaultNetwork() {
        assertNull(Network.current());
    }

    @Test
    public void testSwitchToTestNetwork() {
        Network.useTestNetwork();
        assertEquals("Test DigitalBits Network ; December 2017", Network.current().getNetworkPassphrase());
    }

    @Test
    public void testSwitchToPublicNetwork() {
        Network.usePublicNetwork();
        assertEquals("Live DigitalBits Network ; March 2018", Network.current().getNetworkPassphrase());
    }
}
