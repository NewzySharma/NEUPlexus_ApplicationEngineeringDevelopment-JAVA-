/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuplexus;

import business.dataoperations.DataProcessor;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.UserOrganization;
import business.role.AdminRole;
import business.role.SystemAdminRole;
import business.userAccount.User;
import org.apache.log4j.Logger;

/**
 *
 * @author Apurva
 */
public class ConfigureSystem {

    final static Logger logger = Logger.getLogger(ConfigureSystem.class.getName());

    public static NEUPlexus configure() {
        NEUPlexus system = NEUPlexus.getInstance();
        User ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", "", "", "", new SystemAdminRole());
        logger.info("System admin account created");
        return system;
    }
}
