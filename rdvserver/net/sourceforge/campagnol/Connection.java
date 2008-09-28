/**
 * Connection management
 * 
 * Copyright (C) 2007 Antoine Vianey
 *               2008 Florent Bondoux
 * 
 * This file is part of Campagnol.
 *
 * Campagnol is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Campagnol is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Campagnol.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package net.sourceforge.campagnol;

import java.text.DateFormat;
import java.util.Date;
    
/** represent a peer to peer connection */
public class Connection {

    public ClientStruct client1;                // the one who asked
    public ClientStruct client2;                // the one who is targeted
    private long initTime;                    // date of creation
    
    
    public Connection(ClientStruct client1, ClientStruct client2) {
        this.client1 = client1;
        this.client2 = client2;
        this.initTime = System.currentTimeMillis();
    }
    
    public void updateTime() {
        this.initTime = System.currentTimeMillis();
    }
    
    public String getStartTime() {
        Date date = new Date(this.initTime);
        return DateFormat.getDateTimeInstance().format(date);
    }
    
}
