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
package org.l2jmobius.gameserver.model.olympiad;

enum OlympiadGameState
{
	BEGIN,
	TELEPORT_TO_ARENA,
	GAME_STARTED,
	BATTLE_COUNTDOWN_FIRST,
	BATTLE_COUNTDOWN_SECOND,
	BATTLE_STARTED,
	ROUND_1,
	WAIT_TIME_1,
	ROUND_2,
	WAIT_TIME_2,
	ROUND_3,
	BATTLE_IN_PROGRESS,
	ROUND_ENDED,
	GAME_STOPPED,
	TELEPORT_TO_TOWN,
	CLEANUP,
	IDLE
}