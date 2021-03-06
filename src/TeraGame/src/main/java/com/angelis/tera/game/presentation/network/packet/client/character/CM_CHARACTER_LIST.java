package com.angelis.tera.game.presentation.network.packet.client.character;

import java.nio.ByteBuffer;

import com.angelis.tera.game.presentation.network.connection.TeraGameConnection;
import com.angelis.tera.game.presentation.network.packet.TeraClientPacket;
import com.angelis.tera.game.presentation.network.packet.server.character.SM_CHARACTER_LIST;

public class CM_CHARACTER_LIST extends TeraClientPacket {

    public CM_CHARACTER_LIST(final ByteBuffer byteBuffer, final TeraGameConnection connection) {
        super(byteBuffer, connection);
    }

    @Override
    protected void readImpl() {
        // Empty packet
    }

    @Override
    protected void runImpl() {
        this.getConnection().sendPacket(new SM_CHARACTER_LIST(this.getConnection().getAccount()));
    }
}
