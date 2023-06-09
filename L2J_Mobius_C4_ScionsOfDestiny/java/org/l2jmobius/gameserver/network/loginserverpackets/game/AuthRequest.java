/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jmobius.gameserver.network.loginserverpackets.game;

import org.l2jmobius.commons.network.WritablePacket;

public class AuthRequest extends WritablePacket
{
	/**
	 * Format: cccSddb c desired ID c accept alternative ID c reserve Host s ExternalHostName s InetranlHostName d max players d hexid size b hexid
	 * @param id
	 * @param acceptAlternate
	 * @param hexid
	 * @param externalHost
	 * @param internalHost
	 * @param port
	 * @param reserveHost
	 * @param maxplayer
	 */
	public AuthRequest(int id, boolean acceptAlternate, byte[] hexid, String externalHost, String internalHost, int port, boolean reserveHost, int maxplayer)
	{
		writeByte(0x01);
		writeByte(id);
		writeByte(acceptAlternate ? 0x01 : 0x00);
		writeByte(reserveHost ? 0x01 : 0x00);
		writeString(externalHost);
		writeString(internalHost);
		writeShort(port);
		writeInt(maxplayer);
		writeInt(hexid.length);
		writeBytes(hexid);
	}
}
