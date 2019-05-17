<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGestionGarageServiceProxyid" scope="session" class="services.GestionGarageServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGestionGarageServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleGestionGarageServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleGestionGarageServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        services.GestionGarageService getGestionGarageService10mtemp = sampleGestionGarageServiceProxyid.getGestionGarageService();
if(getGestionGarageService10mtemp == null){
%>
<%=getGestionGarageService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 17:
        gotMethod = true;
        services.Vehicule[] getVehicules17mtemp = sampleGestionGarageServiceProxyid.getVehicules();
if(getVehicules17mtemp == null){
%>
<%=getVehicules17mtemp %>
<%
}else{
        String tempreturnp18 = null;
        if(getVehicules17mtemp != null){
        java.util.List listreturnp18= java.util.Arrays.asList(getVehicules17mtemp);
        tempreturnp18 = listreturnp18.toString();
        }
        %>
        <%=tempreturnp18%>
        <%
}
break;
case 20:
        gotMethod = true;
        String kilometrage_2id=  request.getParameter("kilometrage25");
        int kilometrage_2idTemp  = Integer.parseInt(kilometrage_2id);
        String estLoue_3id=  request.getParameter("estLoue27");
        boolean estLoue_3idTemp  = Boolean.valueOf(estLoue_3id).booleanValue();
        String anneeVehicule_4id=  request.getParameter("anneeVehicule29");
        int anneeVehicule_4idTemp  = Integer.parseInt(anneeVehicule_4id);
        String modele_5id=  request.getParameter("modele31");
            java.lang.String modele_5idTemp = null;
        if(!modele_5id.equals("")){
         modele_5idTemp  = modele_5id;
        }
        String immatriculation_6id=  request.getParameter("immatriculation33");
            java.lang.String immatriculation_6idTemp = null;
        if(!immatriculation_6id.equals("")){
         immatriculation_6idTemp  = immatriculation_6id;
        }
        String couleur_7id=  request.getParameter("couleur35");
            java.lang.String couleur_7idTemp = null;
        if(!couleur_7id.equals("")){
         couleur_7idTemp  = couleur_7id;
        }
        String marque_8id=  request.getParameter("marque37");
            java.lang.String marque_8idTemp = null;
        if(!marque_8id.equals("")){
         marque_8idTemp  = marque_8id;
        }
        String prix_9id=  request.getParameter("prix39");
        double prix_9idTemp  = Double.parseDouble(prix_9id);
        String moteur_10id=  request.getParameter("moteur41");
            java.lang.String moteur_10idTemp = null;
        if(!moteur_10id.equals("")){
         moteur_10idTemp  = moteur_10id;
        }
        String enVente_11id=  request.getParameter("enVente43");
        boolean enVente_11idTemp  = Boolean.valueOf(enVente_11id).booleanValue();
        String options_12id=  request.getParameter("options45");
            java.lang.String options_12idTemp = null;
        if(!options_12id.equals("")){
         options_12idTemp  = options_12id;
        }
        %>
        <jsp:useBean id="services1Vehicule_1id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_1id.setKilometrage(kilometrage_2idTemp);
        services1Vehicule_1id.setEstLoue(estLoue_3idTemp);
        services1Vehicule_1id.setAnneeVehicule(anneeVehicule_4idTemp);
        services1Vehicule_1id.setModele(modele_5idTemp);
        services1Vehicule_1id.setImmatriculation(immatriculation_6idTemp);
        services1Vehicule_1id.setCouleur(couleur_7idTemp);
        services1Vehicule_1id.setMarque(marque_8idTemp);
        services1Vehicule_1id.setPrix(prix_9idTemp);
        services1Vehicule_1id.setMoteur(moteur_10idTemp);
        services1Vehicule_1id.setEnVente(enVente_11idTemp);
        services1Vehicule_1id.setOptions(options_12idTemp);
        sampleGestionGarageServiceProxyid.ajouterVehicule(services1Vehicule_1id);
break;
case 47:
        gotMethod = true;
        String kilometrage_14id=  request.getParameter("kilometrage52");
        int kilometrage_14idTemp  = Integer.parseInt(kilometrage_14id);
        String estLoue_15id=  request.getParameter("estLoue54");
        boolean estLoue_15idTemp  = Boolean.valueOf(estLoue_15id).booleanValue();
        String anneeVehicule_16id=  request.getParameter("anneeVehicule56");
        int anneeVehicule_16idTemp  = Integer.parseInt(anneeVehicule_16id);
        String modele_17id=  request.getParameter("modele58");
            java.lang.String modele_17idTemp = null;
        if(!modele_17id.equals("")){
         modele_17idTemp  = modele_17id;
        }
        String immatriculation_18id=  request.getParameter("immatriculation60");
            java.lang.String immatriculation_18idTemp = null;
        if(!immatriculation_18id.equals("")){
         immatriculation_18idTemp  = immatriculation_18id;
        }
        String couleur_19id=  request.getParameter("couleur62");
            java.lang.String couleur_19idTemp = null;
        if(!couleur_19id.equals("")){
         couleur_19idTemp  = couleur_19id;
        }
        String marque_20id=  request.getParameter("marque64");
            java.lang.String marque_20idTemp = null;
        if(!marque_20id.equals("")){
         marque_20idTemp  = marque_20id;
        }
        String prix_21id=  request.getParameter("prix66");
        double prix_21idTemp  = Double.parseDouble(prix_21id);
        String moteur_22id=  request.getParameter("moteur68");
            java.lang.String moteur_22idTemp = null;
        if(!moteur_22id.equals("")){
         moteur_22idTemp  = moteur_22id;
        }
        String enVente_23id=  request.getParameter("enVente70");
        boolean enVente_23idTemp  = Boolean.valueOf(enVente_23id).booleanValue();
        String options_24id=  request.getParameter("options72");
            java.lang.String options_24idTemp = null;
        if(!options_24id.equals("")){
         options_24idTemp  = options_24id;
        }
        %>
        <jsp:useBean id="services1Vehicule_13id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_13id.setKilometrage(kilometrage_14idTemp);
        services1Vehicule_13id.setEstLoue(estLoue_15idTemp);
        services1Vehicule_13id.setAnneeVehicule(anneeVehicule_16idTemp);
        services1Vehicule_13id.setModele(modele_17idTemp);
        services1Vehicule_13id.setImmatriculation(immatriculation_18idTemp);
        services1Vehicule_13id.setCouleur(couleur_19idTemp);
        services1Vehicule_13id.setMarque(marque_20idTemp);
        services1Vehicule_13id.setPrix(prix_21idTemp);
        services1Vehicule_13id.setMoteur(moteur_22idTemp);
        services1Vehicule_13id.setEnVente(enVente_23idTemp);
        services1Vehicule_13id.setOptions(options_24idTemp);
        sampleGestionGarageServiceProxyid.supprimerVehicule(services1Vehicule_13id);
break;
case 74:
        gotMethod = true;
        String prix_25id=  request.getParameter("prix77");
        double prix_25idTemp  = Double.parseDouble(prix_25id);
        services.Vehicule[] getVehiculesParPrix74mtemp = sampleGestionGarageServiceProxyid.getVehiculesParPrix(prix_25idTemp);
if(getVehiculesParPrix74mtemp == null){
%>
<%=getVehiculesParPrix74mtemp %>
<%
}else{
        String tempreturnp75 = null;
        if(getVehiculesParPrix74mtemp != null){
        java.util.List listreturnp75= java.util.Arrays.asList(getVehiculesParPrix74mtemp);
        tempreturnp75 = listreturnp75.toString();
        }
        %>
        <%=tempreturnp75%>
        <%
}
break;
case 79:
        gotMethod = true;
        String marque_26id=  request.getParameter("marque82");
            java.lang.String marque_26idTemp = null;
        if(!marque_26id.equals("")){
         marque_26idTemp  = marque_26id;
        }
        services.Vehicule[] getVehiculesParMarque79mtemp = sampleGestionGarageServiceProxyid.getVehiculesParMarque(marque_26idTemp);
if(getVehiculesParMarque79mtemp == null){
%>
<%=getVehiculesParMarque79mtemp %>
<%
}else{
        String tempreturnp80 = null;
        if(getVehiculesParMarque79mtemp != null){
        java.util.List listreturnp80= java.util.Arrays.asList(getVehiculesParMarque79mtemp);
        tempreturnp80 = listreturnp80.toString();
        }
        %>
        <%=tempreturnp80%>
        <%
}
break;
case 84:
        gotMethod = true;
        services.Employe[] getEmployes84mtemp = sampleGestionGarageServiceProxyid.getEmployes();
if(getEmployes84mtemp == null){
%>
<%=getEmployes84mtemp %>
<%
}else{
        String tempreturnp85 = null;
        if(getEmployes84mtemp != null){
        java.util.List listreturnp85= java.util.Arrays.asList(getEmployes84mtemp);
        tempreturnp85 = listreturnp85.toString();
        }
        %>
        <%=tempreturnp85%>
        <%
}
break;
case 87:
        gotMethod = true;
        String telephone_28id=  request.getParameter("telephone92");
            java.lang.String telephone_28idTemp = null;
        if(!telephone_28id.equals("")){
         telephone_28idTemp  = telephone_28id;
        }
        String nom_29id=  request.getParameter("nom94");
            java.lang.String nom_29idTemp = null;
        if(!nom_29id.equals("")){
         nom_29idTemp  = nom_29id;
        }
        String mail_30id=  request.getParameter("mail96");
            java.lang.String mail_30idTemp = null;
        if(!mail_30id.equals("")){
         mail_30idTemp  = mail_30id;
        }
        String motDdePasse_31id=  request.getParameter("motDdePasse98");
            java.lang.String motDdePasse_31idTemp = null;
        if(!motDdePasse_31id.equals("")){
         motDdePasse_31idTemp  = motDdePasse_31id;
        }
        String fonction_32id=  request.getParameter("fonction100");
            java.lang.String fonction_32idTemp = null;
        if(!fonction_32id.equals("")){
         fonction_32idTemp  = fonction_32id;
        }
        String matricule_33id=  request.getParameter("matricule102");
        int matricule_33idTemp  = Integer.parseInt(matricule_33id);
        String prenom_34id=  request.getParameter("prenom104");
            java.lang.String prenom_34idTemp = null;
        if(!prenom_34id.equals("")){
         prenom_34idTemp  = prenom_34id;
        }
        %>
        <jsp:useBean id="services1Employe_27id" scope="session" class="services.Employe" />
        <%
        services1Employe_27id.setTelephone(telephone_28idTemp);
        services1Employe_27id.setNom(nom_29idTemp);
        services1Employe_27id.setMail(mail_30idTemp);
        services1Employe_27id.setMotDdePasse(motDdePasse_31idTemp);
        services1Employe_27id.setFonction(fonction_32idTemp);
        services1Employe_27id.setMatricule(matricule_33idTemp);
        services1Employe_27id.setPrenom(prenom_34idTemp);
        sampleGestionGarageServiceProxyid.ajouterEmploye(services1Employe_27id);
break;
case 106:
        gotMethod = true;
        String telephone_36id=  request.getParameter("telephone111");
            java.lang.String telephone_36idTemp = null;
        if(!telephone_36id.equals("")){
         telephone_36idTemp  = telephone_36id;
        }
        String nom_37id=  request.getParameter("nom113");
            java.lang.String nom_37idTemp = null;
        if(!nom_37id.equals("")){
         nom_37idTemp  = nom_37id;
        }
        String mail_38id=  request.getParameter("mail115");
            java.lang.String mail_38idTemp = null;
        if(!mail_38id.equals("")){
         mail_38idTemp  = mail_38id;
        }
        String motDdePasse_39id=  request.getParameter("motDdePasse117");
            java.lang.String motDdePasse_39idTemp = null;
        if(!motDdePasse_39id.equals("")){
         motDdePasse_39idTemp  = motDdePasse_39id;
        }
        String fonction_40id=  request.getParameter("fonction119");
            java.lang.String fonction_40idTemp = null;
        if(!fonction_40id.equals("")){
         fonction_40idTemp  = fonction_40id;
        }
        String matricule_41id=  request.getParameter("matricule121");
        int matricule_41idTemp  = Integer.parseInt(matricule_41id);
        String prenom_42id=  request.getParameter("prenom123");
            java.lang.String prenom_42idTemp = null;
        if(!prenom_42id.equals("")){
         prenom_42idTemp  = prenom_42id;
        }
        %>
        <jsp:useBean id="services1Employe_35id" scope="session" class="services.Employe" />
        <%
        services1Employe_35id.setTelephone(telephone_36idTemp);
        services1Employe_35id.setNom(nom_37idTemp);
        services1Employe_35id.setMail(mail_38idTemp);
        services1Employe_35id.setMotDdePasse(motDdePasse_39idTemp);
        services1Employe_35id.setFonction(fonction_40idTemp);
        services1Employe_35id.setMatricule(matricule_41idTemp);
        services1Employe_35id.setPrenom(prenom_42idTemp);
        sampleGestionGarageServiceProxyid.supprimerEmploye(services1Employe_35id);
break;
case 125:
        gotMethod = true;
        String kilometrage_44id=  request.getParameter("kilometrage130");
        int kilometrage_44idTemp  = Integer.parseInt(kilometrage_44id);
        String estLoue_45id=  request.getParameter("estLoue132");
        boolean estLoue_45idTemp  = Boolean.valueOf(estLoue_45id).booleanValue();
        String anneeVehicule_46id=  request.getParameter("anneeVehicule134");
        int anneeVehicule_46idTemp  = Integer.parseInt(anneeVehicule_46id);
        String modele_47id=  request.getParameter("modele136");
            java.lang.String modele_47idTemp = null;
        if(!modele_47id.equals("")){
         modele_47idTemp  = modele_47id;
        }
        String immatriculation_48id=  request.getParameter("immatriculation138");
            java.lang.String immatriculation_48idTemp = null;
        if(!immatriculation_48id.equals("")){
         immatriculation_48idTemp  = immatriculation_48id;
        }
        String couleur_49id=  request.getParameter("couleur140");
            java.lang.String couleur_49idTemp = null;
        if(!couleur_49id.equals("")){
         couleur_49idTemp  = couleur_49id;
        }
        String marque_50id=  request.getParameter("marque142");
            java.lang.String marque_50idTemp = null;
        if(!marque_50id.equals("")){
         marque_50idTemp  = marque_50id;
        }
        String prix_51id=  request.getParameter("prix144");
        double prix_51idTemp  = Double.parseDouble(prix_51id);
        String moteur_52id=  request.getParameter("moteur146");
            java.lang.String moteur_52idTemp = null;
        if(!moteur_52id.equals("")){
         moteur_52idTemp  = moteur_52id;
        }
        String enVente_53id=  request.getParameter("enVente148");
        boolean enVente_53idTemp  = Boolean.valueOf(enVente_53id).booleanValue();
        String options_54id=  request.getParameter("options150");
            java.lang.String options_54idTemp = null;
        if(!options_54id.equals("")){
         options_54idTemp  = options_54id;
        }
        %>
        <jsp:useBean id="services1Vehicule_43id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_43id.setKilometrage(kilometrage_44idTemp);
        services1Vehicule_43id.setEstLoue(estLoue_45idTemp);
        services1Vehicule_43id.setAnneeVehicule(anneeVehicule_46idTemp);
        services1Vehicule_43id.setModele(modele_47idTemp);
        services1Vehicule_43id.setImmatriculation(immatriculation_48idTemp);
        services1Vehicule_43id.setCouleur(couleur_49idTemp);
        services1Vehicule_43id.setMarque(marque_50idTemp);
        services1Vehicule_43id.setPrix(prix_51idTemp);
        services1Vehicule_43id.setMoteur(moteur_52idTemp);
        services1Vehicule_43id.setEnVente(enVente_53idTemp);
        services1Vehicule_43id.setOptions(options_54idTemp);
        sampleGestionGarageServiceProxyid.achatVehicule(services1Vehicule_43id);
break;
case 152:
        gotMethod = true;
        String kilometrage_56id=  request.getParameter("kilometrage157");
        int kilometrage_56idTemp  = Integer.parseInt(kilometrage_56id);
        String estLoue_57id=  request.getParameter("estLoue159");
        boolean estLoue_57idTemp  = Boolean.valueOf(estLoue_57id).booleanValue();
        String anneeVehicule_58id=  request.getParameter("anneeVehicule161");
        int anneeVehicule_58idTemp  = Integer.parseInt(anneeVehicule_58id);
        String modele_59id=  request.getParameter("modele163");
            java.lang.String modele_59idTemp = null;
        if(!modele_59id.equals("")){
         modele_59idTemp  = modele_59id;
        }
        String immatriculation_60id=  request.getParameter("immatriculation165");
            java.lang.String immatriculation_60idTemp = null;
        if(!immatriculation_60id.equals("")){
         immatriculation_60idTemp  = immatriculation_60id;
        }
        String couleur_61id=  request.getParameter("couleur167");
            java.lang.String couleur_61idTemp = null;
        if(!couleur_61id.equals("")){
         couleur_61idTemp  = couleur_61id;
        }
        String marque_62id=  request.getParameter("marque169");
            java.lang.String marque_62idTemp = null;
        if(!marque_62id.equals("")){
         marque_62idTemp  = marque_62id;
        }
        String prix_63id=  request.getParameter("prix171");
        double prix_63idTemp  = Double.parseDouble(prix_63id);
        String moteur_64id=  request.getParameter("moteur173");
            java.lang.String moteur_64idTemp = null;
        if(!moteur_64id.equals("")){
         moteur_64idTemp  = moteur_64id;
        }
        String enVente_65id=  request.getParameter("enVente175");
        boolean enVente_65idTemp  = Boolean.valueOf(enVente_65id).booleanValue();
        String options_66id=  request.getParameter("options177");
            java.lang.String options_66idTemp = null;
        if(!options_66id.equals("")){
         options_66idTemp  = options_66id;
        }
        %>
        <jsp:useBean id="services1Vehicule_55id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_55id.setKilometrage(kilometrage_56idTemp);
        services1Vehicule_55id.setEstLoue(estLoue_57idTemp);
        services1Vehicule_55id.setAnneeVehicule(anneeVehicule_58idTemp);
        services1Vehicule_55id.setModele(modele_59idTemp);
        services1Vehicule_55id.setImmatriculation(immatriculation_60idTemp);
        services1Vehicule_55id.setCouleur(couleur_61idTemp);
        services1Vehicule_55id.setMarque(marque_62idTemp);
        services1Vehicule_55id.setPrix(prix_63idTemp);
        services1Vehicule_55id.setMoteur(moteur_64idTemp);
        services1Vehicule_55id.setEnVente(enVente_65idTemp);
        services1Vehicule_55id.setOptions(options_66idTemp);
        sampleGestionGarageServiceProxyid.locationVehicule(services1Vehicule_55id);
break;
case 179:
        gotMethod = true;
        String immatriculation_67id=  request.getParameter("immatriculation204");
            java.lang.String immatriculation_67idTemp = null;
        if(!immatriculation_67id.equals("")){
         immatriculation_67idTemp  = immatriculation_67id;
        }
        services.Vehicule getVehicule179mtemp = sampleGestionGarageServiceProxyid.getVehicule(immatriculation_67idTemp);
if(getVehicule179mtemp == null){
%>
<%=getVehicule179mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">kilometrage:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
%>
<%=getVehicule179mtemp.getKilometrage()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">estLoue:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
%>
<%=getVehicule179mtemp.isEstLoue()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">anneeVehicule:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
%>
<%=getVehicule179mtemp.getAnneeVehicule()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">modele:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
java.lang.String typemodele188 = getVehicule179mtemp.getModele();
        String tempResultmodele188 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemodele188));
        %>
        <%= tempResultmodele188 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">immatriculation:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
java.lang.String typeimmatriculation190 = getVehicule179mtemp.getImmatriculation();
        String tempResultimmatriculation190 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimmatriculation190));
        %>
        <%= tempResultimmatriculation190 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">couleur:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
java.lang.String typecouleur192 = getVehicule179mtemp.getCouleur();
        String tempResultcouleur192 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecouleur192));
        %>
        <%= tempResultcouleur192 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">marque:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
java.lang.String typemarque194 = getVehicule179mtemp.getMarque();
        String tempResultmarque194 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemarque194));
        %>
        <%= tempResultmarque194 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">prix:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
%>
<%=getVehicule179mtemp.getPrix()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">moteur:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
java.lang.String typemoteur198 = getVehicule179mtemp.getMoteur();
        String tempResultmoteur198 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemoteur198));
        %>
        <%= tempResultmoteur198 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">enVente:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
%>
<%=getVehicule179mtemp.isEnVente()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">options:</TD>
<TD>
<%
if(getVehicule179mtemp != null){
java.lang.String typeoptions202 = getVehicule179mtemp.getOptions();
        String tempResultoptions202 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeoptions202));
        %>
        <%= tempResultoptions202 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>