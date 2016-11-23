package org.jivesoftware.smack;

/**
 * Created by kamran on 23/11/16.
 */
public class XmppTest {
    public static void main(String... args) throws Exception {
        BOSHConfiguration config = new BOSHConfiguration(false, "192.168.0.12", 80,
                "/ejabberd", "10.252.220.198");

        BOSHConnection connection = new BOSHConnection(config);

        connection.connect();

        connection.login("kamran", "xmpp", "");
    }
}
