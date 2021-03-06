package com.silverpop.api.client;


import com.silverpop.api.client.command.GetListsCommand;
import com.silverpop.api.client.result.GetListsResult;
import com.silverpop.api.client.result.elements.GetListsList;
import com.silverpop.api.client.xmlapi.XmlApiClient;

import java.util.Collection;

public class ClientDemo {


    public static void main(String[] args) throws Exception {
        System.out.println("Silverpop API Client Demo");
        String argsString = "";
        for (String arg : args) {
            argsString = argsString + " " + arg;
        }
        System.out.println("Args : " + argsString);
        XmlApiClient apiClient = new XmlApiClient(args[0], args[1], args[2]);
        GetListsResult result = (GetListsResult) apiClient.executeCommand(new GetListsCommand());
        Collection<GetListsList> lists = result.getLists();
        for (GetListsList list : lists) {
            System.out.println(list.getName());
        }
    }
}
