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
package com.l2jmobius.gameserver.model.events.impl.instance;

import com.l2jmobius.gameserver.model.actor.instance.L2PcInstance;
import com.l2jmobius.gameserver.model.events.EventType;
import com.l2jmobius.gameserver.model.events.impl.IBaseEvent;
import com.l2jmobius.gameserver.model.instancezone.Instance;

/**
 * @author malyeflik
 */
public final class OnInstanceLeave implements IBaseEvent
{
	private final L2PcInstance _player;
	private final Instance _instance;
	
	public OnInstanceLeave(L2PcInstance player, Instance instance)
	{
		_player = player;
		_instance = instance;
	}
	
	public L2PcInstance getPlayer()
	{
		return _player;
	}
	
	public Instance getInstanceWorld()
	{
		return _instance;
	}
	
	@Override
	public EventType getType()
	{
		return EventType.ON_INSTANCE_LEAVE;
	}
}
