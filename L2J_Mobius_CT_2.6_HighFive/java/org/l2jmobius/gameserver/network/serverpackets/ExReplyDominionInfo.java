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
package org.l2jmobius.gameserver.network.serverpackets;

import java.util.List;

import org.l2jmobius.gameserver.instancemanager.CastleManager;
import org.l2jmobius.gameserver.instancemanager.TerritoryWarManager;
import org.l2jmobius.gameserver.instancemanager.TerritoryWarManager.Territory;
import org.l2jmobius.gameserver.network.ServerPackets;

/**
 * @author JIV
 */
public class ExReplyDominionInfo extends ServerPacket
{
	public static final ExReplyDominionInfo STATIC_PACKET = new ExReplyDominionInfo();
	
	private ExReplyDominionInfo()
	{
	}
	
	@Override
	public void write()
	{
		ServerPackets.EX_REPLY_DOMINION_INFO.writeId(this);
		final List<Territory> territoryList = TerritoryWarManager.getInstance().getAllTerritories();
		writeInt(territoryList.size()); // Territory Count
		for (Territory t : territoryList)
		{
			writeInt(t.getTerritoryId()); // Territory Id
			writeString(CastleManager.getInstance().getCastleById(t.getCastleId()).getName().toLowerCase() + "_dominion"); // territory name
			writeString(t.getOwnerClan().getName());
			writeInt(t.getOwnedWardIds().size()); // Emblem Count
			for (int i : t.getOwnedWardIds())
			{
				writeInt(i); // Emblem ID - should be in for loop for emblem count
			}
			writeInt((int) (TerritoryWarManager.getInstance().getTWStartTimeInMillis() / 1000));
		}
	}
}
