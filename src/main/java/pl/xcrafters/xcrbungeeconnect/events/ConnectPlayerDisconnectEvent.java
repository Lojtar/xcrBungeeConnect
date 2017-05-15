package pl.xcrafters.xcrbungeeconnect.events;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Event;

import java.util.UUID;

public class ConnectPlayerDisconnectEvent extends Event {

    private UUID uuid;
    private String nick, ip;

    public ConnectPlayerDisconnectEvent(UUID uuid, String nick, String ip) {
        this.uuid = uuid;
        this.nick = nick;
        this.ip = ip;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public String getNick() {
        return this.nick;
    }

    public String getIP() {
        return this.ip;
    }

}
