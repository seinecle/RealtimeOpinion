/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/*
 Copyright 2008-2013 Clement Levallois
 Authors : Clement Levallois <clementlevallois@gmail.com>
 Website : http://www.clementlevallois.net


 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

 Copyright 2013 Clement Levallois. All rights reserved.

 The contents of this file are subject to the terms of either the GNU
 General Public License Version 3 only ("GPL") or the Common
 Development and Distribution License("CDDL") (collectively, the
 "License"). You may not use this file except in compliance with the
 License. You can obtain a copy of the License at
 http://gephi.org/about/legal/license-notice/
 or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
 specific language governing permissions and limitations under the
 License.  When distributing the software, include this License Header
 Notice in each file and include the License files at
 /cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
 License Header, with the fields enclosed by brackets [] replaced by
 your own identifying information:
 "Portions Copyrighted [year] [name of copyright owner]"

 If you wish your version of this file to be governed by only the CDDL
 or only the GPL Version 3, indicate your decision by adding
 "[Contributor] elects to include this software in this distribution
 under the [CDDL or GPL Version 3] license." If you do not indicate a
 single choice of license, a recipient has the option to distribute
 your version of this file under either the CDDL, the GPL Version 3 or
 to extend the choice of license to its licensees as provided above.
 However, if you add GPL Version 3 code and therefore, elected the GPL
 Version 3 license, then the option applies only if the new code is
 made subject to such option by the copyright holder.

 Contributor(s): Clement Levallois

 */
@ManagedBean (eager=true)
@ApplicationScoped
public class SharedBean implements Serializable{
    
    private Map<String,Map<String,Float>> mapSessionCodesToIPsToGrades = new HashMap();
    private Map<String,Map<String,Long>> mapSessionCodesToIPsToTime = new HashMap();
    private Map<String,LocalDate> mapSessionCodesToDay = new HashMap();

    public Map<String, Float> getOneMapIPToGrade(String sessionCode) {
        return mapSessionCodesToIPsToGrades.get(sessionCode);
    }

    public Map<String, Long> getOneMapIPToTime(String sessionCode) {
        return mapSessionCodesToIPsToTime.get(sessionCode);
    }

    
    public void updateMapSessionCodesToIPsToGrades(String sessionCode,Map<String, Float> map) {
        mapSessionCodesToIPsToGrades.put(sessionCode, map);
    }

    public Map<String, LocalDate> getMapSessionCodesToDay() {
        return mapSessionCodesToDay;
    }

    public void setMapSessionCodesToDay(Map<String, LocalDate> mapSessionCodesToDay) {
        this.mapSessionCodesToDay = mapSessionCodesToDay;
    }

    public Map<String, Map<String, Float>> getMapSessionCodesToIPsToGrades() {
        return mapSessionCodesToIPsToGrades;
    }

    public void setMapSessionCodesToIPsToGrades(Map<String, Map<String, Float>> mapSessionCodesToIPsToGrades) {
        this.mapSessionCodesToIPsToGrades = mapSessionCodesToIPsToGrades;
    }

    public Map<String, Map<String, Long>> getMapSessionCodesToIPsToTime() {
        return mapSessionCodesToIPsToTime;
    }

    public void setMapSessionCodesToIPsToTime(Map<String, Map<String, Long>> mapSessionCodesToIPsToTime) {
        this.mapSessionCodesToIPsToTime = mapSessionCodesToIPsToTime;
    }

    
}
