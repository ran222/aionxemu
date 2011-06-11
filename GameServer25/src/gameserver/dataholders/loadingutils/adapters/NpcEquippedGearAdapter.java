/**
 * This file is part of alpha team <alpha-team.com>.
 *
 * alpha team is pryvate software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * alpha team is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with alpha team.  If not, see <http://www.gnu.org/licenses/>.
 */
package gameserver.dataholders.loadingutils.adapters;

import gameserver.model.items.NpcEquippedGear;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Luno
 */
public class NpcEquippedGearAdapter extends XmlAdapter<NpcEquipmentList, NpcEquippedGear> {
    /* (non-Javadoc)
      * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
      */

    @Override
    public NpcEquipmentList marshal(NpcEquippedGear v) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
      * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
      */

    @Override
    public NpcEquippedGear unmarshal(NpcEquipmentList v) throws Exception {
        return new NpcEquippedGear(v);
    }

}
