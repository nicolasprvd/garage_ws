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
        String marque_7id=  request.getParameter("marque35");
            java.lang.String marque_7idTemp = null;
        if(!marque_7id.equals("")){
         marque_7idTemp  = marque_7id;
        }
        String couleur_8id=  request.getParameter("couleur37");
            java.lang.String couleur_8idTemp = null;
        if(!couleur_8id.equals("")){
         couleur_8idTemp  = couleur_8id;
        }
        String moteur_9id=  request.getParameter("moteur39");
            java.lang.String moteur_9idTemp = null;
        if(!moteur_9id.equals("")){
         moteur_9idTemp  = moteur_9id;
        }
        String prix_10id=  request.getParameter("prix41");
        double prix_10idTemp  = Double.parseDouble(prix_10id);
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
        services1Vehicule_1id.setMarque(marque_7idTemp);
        services1Vehicule_1id.setCouleur(couleur_8idTemp);
        services1Vehicule_1id.setMoteur(moteur_9idTemp);
        services1Vehicule_1id.setPrix(prix_10idTemp);
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
        String marque_19id=  request.getParameter("marque62");
            java.lang.String marque_19idTemp = null;
        if(!marque_19id.equals("")){
         marque_19idTemp  = marque_19id;
        }
        String couleur_20id=  request.getParameter("couleur64");
            java.lang.String couleur_20idTemp = null;
        if(!couleur_20id.equals("")){
         couleur_20idTemp  = couleur_20id;
        }
        String moteur_21id=  request.getParameter("moteur66");
            java.lang.String moteur_21idTemp = null;
        if(!moteur_21id.equals("")){
         moteur_21idTemp  = moteur_21id;
        }
        String prix_22id=  request.getParameter("prix68");
        double prix_22idTemp  = Double.parseDouble(prix_22id);
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
        services1Vehicule_13id.setMarque(marque_19idTemp);
        services1Vehicule_13id.setCouleur(couleur_20idTemp);
        services1Vehicule_13id.setMoteur(moteur_21idTemp);
        services1Vehicule_13id.setPrix(prix_22idTemp);
        services1Vehicule_13id.setEnVente(enVente_23idTemp);
        services1Vehicule_13id.setOptions(options_24idTemp);
        sampleGestionGarageServiceProxyid.supprimerVehicule(services1Vehicule_13id);
break;
case 74:
        gotMethod = true;
        String marque_25id=  request.getParameter("marque77");
            java.lang.String marque_25idTemp = null;
        if(!marque_25id.equals("")){
         marque_25idTemp  = marque_25id;
        }
        services.Vehicule[] getVehiculesParMarque74mtemp = sampleGestionGarageServiceProxyid.getVehiculesParMarque(marque_25idTemp);
if(getVehiculesParMarque74mtemp == null){
%>
<%=getVehiculesParMarque74mtemp %>
<%
}else{
        String tempreturnp75 = null;
        if(getVehiculesParMarque74mtemp != null){
        java.util.List listreturnp75= java.util.Arrays.asList(getVehiculesParMarque74mtemp);
        tempreturnp75 = listreturnp75.toString();
        }
        %>
        <%=tempreturnp75%>
        <%
}
break;
case 79:
        gotMethod = true;
        String prix_26id=  request.getParameter("prix82");
        double prix_26idTemp  = Double.parseDouble(prix_26id);
        services.Vehicule[] getVehiculesParPrix79mtemp = sampleGestionGarageServiceProxyid.getVehiculesParPrix(prix_26idTemp);
if(getVehiculesParPrix79mtemp == null){
%>
<%=getVehiculesParPrix79mtemp %>
<%
}else{
        String tempreturnp80 = null;
        if(getVehiculesParPrix79mtemp != null){
        java.util.List listreturnp80= java.util.Arrays.asList(getVehiculesParPrix79mtemp);
        tempreturnp80 = listreturnp80.toString();
        }
        %>
        <%=tempreturnp80%>
        <%
}
break;
case 84:
        gotMethod = true;
        String kilometrage_28id=  request.getParameter("kilometrage89");
        int kilometrage_28idTemp  = Integer.parseInt(kilometrage_28id);
        String estLoue_29id=  request.getParameter("estLoue91");
        boolean estLoue_29idTemp  = Boolean.valueOf(estLoue_29id).booleanValue();
        String anneeVehicule_30id=  request.getParameter("anneeVehicule93");
        int anneeVehicule_30idTemp  = Integer.parseInt(anneeVehicule_30id);
        String modele_31id=  request.getParameter("modele95");
            java.lang.String modele_31idTemp = null;
        if(!modele_31id.equals("")){
         modele_31idTemp  = modele_31id;
        }
        String immatriculation_32id=  request.getParameter("immatriculation97");
            java.lang.String immatriculation_32idTemp = null;
        if(!immatriculation_32id.equals("")){
         immatriculation_32idTemp  = immatriculation_32id;
        }
        String marque_33id=  request.getParameter("marque99");
            java.lang.String marque_33idTemp = null;
        if(!marque_33id.equals("")){
         marque_33idTemp  = marque_33id;
        }
        String couleur_34id=  request.getParameter("couleur101");
            java.lang.String couleur_34idTemp = null;
        if(!couleur_34id.equals("")){
         couleur_34idTemp  = couleur_34id;
        }
        String moteur_35id=  request.getParameter("moteur103");
            java.lang.String moteur_35idTemp = null;
        if(!moteur_35id.equals("")){
         moteur_35idTemp  = moteur_35id;
        }
        String prix_36id=  request.getParameter("prix105");
        double prix_36idTemp  = Double.parseDouble(prix_36id);
        String enVente_37id=  request.getParameter("enVente107");
        boolean enVente_37idTemp  = Boolean.valueOf(enVente_37id).booleanValue();
        String options_38id=  request.getParameter("options109");
            java.lang.String options_38idTemp = null;
        if(!options_38id.equals("")){
         options_38idTemp  = options_38id;
        }
        %>
        <jsp:useBean id="services1Vehicule_27id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_27id.setKilometrage(kilometrage_28idTemp);
        services1Vehicule_27id.setEstLoue(estLoue_29idTemp);
        services1Vehicule_27id.setAnneeVehicule(anneeVehicule_30idTemp);
        services1Vehicule_27id.setModele(modele_31idTemp);
        services1Vehicule_27id.setImmatriculation(immatriculation_32idTemp);
        services1Vehicule_27id.setMarque(marque_33idTemp);
        services1Vehicule_27id.setCouleur(couleur_34idTemp);
        services1Vehicule_27id.setMoteur(moteur_35idTemp);
        services1Vehicule_27id.setPrix(prix_36idTemp);
        services1Vehicule_27id.setEnVente(enVente_37idTemp);
        services1Vehicule_27id.setOptions(options_38idTemp);
        sampleGestionGarageServiceProxyid.retourLocationVehicule(services1Vehicule_27id);
break;
case 111:
        gotMethod = true;
        String immatriculation_39id=  request.getParameter("immatriculation136");
            java.lang.String immatriculation_39idTemp = null;
        if(!immatriculation_39id.equals("")){
         immatriculation_39idTemp  = immatriculation_39id;
        }
        services.Vehicule getVehicule111mtemp = sampleGestionGarageServiceProxyid.getVehicule(immatriculation_39idTemp);
if(getVehicule111mtemp == null){
%>
<%=getVehicule111mtemp %>
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
if(getVehicule111mtemp != null){
%>
<%=getVehicule111mtemp.getKilometrage()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">estLoue:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
%>
<%=getVehicule111mtemp.isEstLoue()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">anneeVehicule:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
%>
<%=getVehicule111mtemp.getAnneeVehicule()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">modele:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
java.lang.String typemodele120 = getVehicule111mtemp.getModele();
        String tempResultmodele120 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemodele120));
        %>
        <%= tempResultmodele120 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">immatriculation:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
java.lang.String typeimmatriculation122 = getVehicule111mtemp.getImmatriculation();
        String tempResultimmatriculation122 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimmatriculation122));
        %>
        <%= tempResultimmatriculation122 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">marque:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
java.lang.String typemarque124 = getVehicule111mtemp.getMarque();
        String tempResultmarque124 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemarque124));
        %>
        <%= tempResultmarque124 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">couleur:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
java.lang.String typecouleur126 = getVehicule111mtemp.getCouleur();
        String tempResultcouleur126 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecouleur126));
        %>
        <%= tempResultcouleur126 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">moteur:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
java.lang.String typemoteur128 = getVehicule111mtemp.getMoteur();
        String tempResultmoteur128 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemoteur128));
        %>
        <%= tempResultmoteur128 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">prix:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
%>
<%=getVehicule111mtemp.getPrix()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">enVente:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
%>
<%=getVehicule111mtemp.isEnVente()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">options:</TD>
<TD>
<%
if(getVehicule111mtemp != null){
java.lang.String typeoptions134 = getVehicule111mtemp.getOptions();
        String tempResultoptions134 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeoptions134));
        %>
        <%= tempResultoptions134 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 138:
        gotMethod = true;
        String mail_41id=  request.getParameter("mail143");
            java.lang.String mail_41idTemp = null;
        if(!mail_41id.equals("")){
         mail_41idTemp  = mail_41id;
        }
        String telephone_42id=  request.getParameter("telephone145");
            java.lang.String telephone_42idTemp = null;
        if(!telephone_42id.equals("")){
         telephone_42idTemp  = telephone_42id;
        }
        String nom_43id=  request.getParameter("nom147");
            java.lang.String nom_43idTemp = null;
        if(!nom_43id.equals("")){
         nom_43idTemp  = nom_43id;
        }
        String fonction_44id=  request.getParameter("fonction149");
            java.lang.String fonction_44idTemp = null;
        if(!fonction_44id.equals("")){
         fonction_44idTemp  = fonction_44id;
        }
        String matricule_45id=  request.getParameter("matricule151");
        int matricule_45idTemp  = Integer.parseInt(matricule_45id);
        String motDePasse_46id=  request.getParameter("motDePasse153");
            java.lang.String motDePasse_46idTemp = null;
        if(!motDePasse_46id.equals("")){
         motDePasse_46idTemp  = motDePasse_46id;
        }
        String prenom_47id=  request.getParameter("prenom155");
            java.lang.String prenom_47idTemp = null;
        if(!prenom_47id.equals("")){
         prenom_47idTemp  = prenom_47id;
        }
        %>
        <jsp:useBean id="services1Employe_40id" scope="session" class="services.Employe" />
        <%
        services1Employe_40id.setMail(mail_41idTemp);
        services1Employe_40id.setTelephone(telephone_42idTemp);
        services1Employe_40id.setNom(nom_43idTemp);
        services1Employe_40id.setFonction(fonction_44idTemp);
        services1Employe_40id.setMatricule(matricule_45idTemp);
        services1Employe_40id.setMotDePasse(motDePasse_46idTemp);
        services1Employe_40id.setPrenom(prenom_47idTemp);
        sampleGestionGarageServiceProxyid.ajouterEmploye(services1Employe_40id);
break;
case 157:
        gotMethod = true;
        String mail_49id=  request.getParameter("mail162");
            java.lang.String mail_49idTemp = null;
        if(!mail_49id.equals("")){
         mail_49idTemp  = mail_49id;
        }
        String telephone_50id=  request.getParameter("telephone164");
            java.lang.String telephone_50idTemp = null;
        if(!telephone_50id.equals("")){
         telephone_50idTemp  = telephone_50id;
        }
        String nom_51id=  request.getParameter("nom166");
            java.lang.String nom_51idTemp = null;
        if(!nom_51id.equals("")){
         nom_51idTemp  = nom_51id;
        }
        String fonction_52id=  request.getParameter("fonction168");
            java.lang.String fonction_52idTemp = null;
        if(!fonction_52id.equals("")){
         fonction_52idTemp  = fonction_52id;
        }
        String matricule_53id=  request.getParameter("matricule170");
        int matricule_53idTemp  = Integer.parseInt(matricule_53id);
        String motDePasse_54id=  request.getParameter("motDePasse172");
            java.lang.String motDePasse_54idTemp = null;
        if(!motDePasse_54id.equals("")){
         motDePasse_54idTemp  = motDePasse_54id;
        }
        String prenom_55id=  request.getParameter("prenom174");
            java.lang.String prenom_55idTemp = null;
        if(!prenom_55id.equals("")){
         prenom_55idTemp  = prenom_55id;
        }
        %>
        <jsp:useBean id="services1Employe_48id" scope="session" class="services.Employe" />
        <%
        services1Employe_48id.setMail(mail_49idTemp);
        services1Employe_48id.setTelephone(telephone_50idTemp);
        services1Employe_48id.setNom(nom_51idTemp);
        services1Employe_48id.setFonction(fonction_52idTemp);
        services1Employe_48id.setMatricule(matricule_53idTemp);
        services1Employe_48id.setMotDePasse(motDePasse_54idTemp);
        services1Employe_48id.setPrenom(prenom_55idTemp);
        sampleGestionGarageServiceProxyid.supprimerEmploye(services1Employe_48id);
break;
case 176:
        gotMethod = true;
        String kilometrage_57id=  request.getParameter("kilometrage181");
        int kilometrage_57idTemp  = Integer.parseInt(kilometrage_57id);
        String estLoue_58id=  request.getParameter("estLoue183");
        boolean estLoue_58idTemp  = Boolean.valueOf(estLoue_58id).booleanValue();
        String anneeVehicule_59id=  request.getParameter("anneeVehicule185");
        int anneeVehicule_59idTemp  = Integer.parseInt(anneeVehicule_59id);
        String modele_60id=  request.getParameter("modele187");
            java.lang.String modele_60idTemp = null;
        if(!modele_60id.equals("")){
         modele_60idTemp  = modele_60id;
        }
        String immatriculation_61id=  request.getParameter("immatriculation189");
            java.lang.String immatriculation_61idTemp = null;
        if(!immatriculation_61id.equals("")){
         immatriculation_61idTemp  = immatriculation_61id;
        }
        String marque_62id=  request.getParameter("marque191");
            java.lang.String marque_62idTemp = null;
        if(!marque_62id.equals("")){
         marque_62idTemp  = marque_62id;
        }
        String couleur_63id=  request.getParameter("couleur193");
            java.lang.String couleur_63idTemp = null;
        if(!couleur_63id.equals("")){
         couleur_63idTemp  = couleur_63id;
        }
        String moteur_64id=  request.getParameter("moteur195");
            java.lang.String moteur_64idTemp = null;
        if(!moteur_64id.equals("")){
         moteur_64idTemp  = moteur_64id;
        }
        String prix_65id=  request.getParameter("prix197");
        double prix_65idTemp  = Double.parseDouble(prix_65id);
        String enVente_66id=  request.getParameter("enVente199");
        boolean enVente_66idTemp  = Boolean.valueOf(enVente_66id).booleanValue();
        String options_67id=  request.getParameter("options201");
            java.lang.String options_67idTemp = null;
        if(!options_67id.equals("")){
         options_67idTemp  = options_67id;
        }
        %>
        <jsp:useBean id="services1Vehicule_56id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_56id.setKilometrage(kilometrage_57idTemp);
        services1Vehicule_56id.setEstLoue(estLoue_58idTemp);
        services1Vehicule_56id.setAnneeVehicule(anneeVehicule_59idTemp);
        services1Vehicule_56id.setModele(modele_60idTemp);
        services1Vehicule_56id.setImmatriculation(immatriculation_61idTemp);
        services1Vehicule_56id.setMarque(marque_62idTemp);
        services1Vehicule_56id.setCouleur(couleur_63idTemp);
        services1Vehicule_56id.setMoteur(moteur_64idTemp);
        services1Vehicule_56id.setPrix(prix_65idTemp);
        services1Vehicule_56id.setEnVente(enVente_66idTemp);
        services1Vehicule_56id.setOptions(options_67idTemp);
        sampleGestionGarageServiceProxyid.locationVehicule(services1Vehicule_56id);
break;
case 203:
        gotMethod = true;
        String kilometrage_69id=  request.getParameter("kilometrage208");
        int kilometrage_69idTemp  = Integer.parseInt(kilometrage_69id);
        String estLoue_70id=  request.getParameter("estLoue210");
        boolean estLoue_70idTemp  = Boolean.valueOf(estLoue_70id).booleanValue();
        String anneeVehicule_71id=  request.getParameter("anneeVehicule212");
        int anneeVehicule_71idTemp  = Integer.parseInt(anneeVehicule_71id);
        String modele_72id=  request.getParameter("modele214");
            java.lang.String modele_72idTemp = null;
        if(!modele_72id.equals("")){
         modele_72idTemp  = modele_72id;
        }
        String immatriculation_73id=  request.getParameter("immatriculation216");
            java.lang.String immatriculation_73idTemp = null;
        if(!immatriculation_73id.equals("")){
         immatriculation_73idTemp  = immatriculation_73id;
        }
        String marque_74id=  request.getParameter("marque218");
            java.lang.String marque_74idTemp = null;
        if(!marque_74id.equals("")){
         marque_74idTemp  = marque_74id;
        }
        String couleur_75id=  request.getParameter("couleur220");
            java.lang.String couleur_75idTemp = null;
        if(!couleur_75id.equals("")){
         couleur_75idTemp  = couleur_75id;
        }
        String moteur_76id=  request.getParameter("moteur222");
            java.lang.String moteur_76idTemp = null;
        if(!moteur_76id.equals("")){
         moteur_76idTemp  = moteur_76id;
        }
        String prix_77id=  request.getParameter("prix224");
        double prix_77idTemp  = Double.parseDouble(prix_77id);
        String enVente_78id=  request.getParameter("enVente226");
        boolean enVente_78idTemp  = Boolean.valueOf(enVente_78id).booleanValue();
        String options_79id=  request.getParameter("options228");
            java.lang.String options_79idTemp = null;
        if(!options_79id.equals("")){
         options_79idTemp  = options_79id;
        }
        %>
        <jsp:useBean id="services1Vehicule_68id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_68id.setKilometrage(kilometrage_69idTemp);
        services1Vehicule_68id.setEstLoue(estLoue_70idTemp);
        services1Vehicule_68id.setAnneeVehicule(anneeVehicule_71idTemp);
        services1Vehicule_68id.setModele(modele_72idTemp);
        services1Vehicule_68id.setImmatriculation(immatriculation_73idTemp);
        services1Vehicule_68id.setMarque(marque_74idTemp);
        services1Vehicule_68id.setCouleur(couleur_75idTemp);
        services1Vehicule_68id.setMoteur(moteur_76idTemp);
        services1Vehicule_68id.setPrix(prix_77idTemp);
        services1Vehicule_68id.setEnVente(enVente_78idTemp);
        services1Vehicule_68id.setOptions(options_79idTemp);
        sampleGestionGarageServiceProxyid.achatVehicule(services1Vehicule_68id);
break;
case 230:
        gotMethod = true;
        services.Employe[] getEmployes230mtemp = sampleGestionGarageServiceProxyid.getEmployes();
if(getEmployes230mtemp == null){
%>
<%=getEmployes230mtemp %>
<%
}else{
        String tempreturnp231 = null;
        if(getEmployes230mtemp != null){
        java.util.List listreturnp231= java.util.Arrays.asList(getEmployes230mtemp);
        tempreturnp231 = listreturnp231.toString();
        }
        %>
        <%=tempreturnp231%>
        <%
}
break;
case 233:
        gotMethod = true;
        String kmMin_80id=  request.getParameter("kmMin236");
        int kmMin_80idTemp  = Integer.parseInt(kmMin_80id);
        String kmMax_81id=  request.getParameter("kmMax238");
        int kmMax_81idTemp  = Integer.parseInt(kmMax_81id);
        services.Vehicule[] getVehiculesParTrancheDeKM233mtemp = sampleGestionGarageServiceProxyid.getVehiculesParTrancheDeKM(kmMin_80idTemp,kmMax_81idTemp);
if(getVehiculesParTrancheDeKM233mtemp == null){
%>
<%=getVehiculesParTrancheDeKM233mtemp %>
<%
}else{
        String tempreturnp234 = null;
        if(getVehiculesParTrancheDeKM233mtemp != null){
        java.util.List listreturnp234= java.util.Arrays.asList(getVehiculesParTrancheDeKM233mtemp);
        tempreturnp234 = listreturnp234.toString();
        }
        %>
        <%=tempreturnp234%>
        <%
}
break;
case 240:
        gotMethod = true;
        String prixMin_82id=  request.getParameter("prixMin243");
        double prixMin_82idTemp  = Double.parseDouble(prixMin_82id);
        String prixMax_83id=  request.getParameter("prixMax245");
        double prixMax_83idTemp  = Double.parseDouble(prixMax_83id);
        services.Vehicule[] getVehiculesParTrancheDePrix240mtemp = sampleGestionGarageServiceProxyid.getVehiculesParTrancheDePrix(prixMin_82idTemp,prixMax_83idTemp);
if(getVehiculesParTrancheDePrix240mtemp == null){
%>
<%=getVehiculesParTrancheDePrix240mtemp %>
<%
}else{
        String tempreturnp241 = null;
        if(getVehiculesParTrancheDePrix240mtemp != null){
        java.util.List listreturnp241= java.util.Arrays.asList(getVehiculesParTrancheDePrix240mtemp);
        tempreturnp241 = listreturnp241.toString();
        }
        %>
        <%=tempreturnp241%>
        <%
}
break;
case 247:
        gotMethod = true;
        String marque_84id=  request.getParameter("marque250");
            java.lang.String marque_84idTemp = null;
        if(!marque_84id.equals("")){
         marque_84idTemp  = marque_84id;
        }
        String modele_85id=  request.getParameter("modele252");
            java.lang.String modele_85idTemp = null;
        if(!modele_85id.equals("")){
         modele_85idTemp  = modele_85id;
        }
        String moteur_86id=  request.getParameter("moteur254");
            java.lang.String moteur_86idTemp = null;
        if(!moteur_86id.equals("")){
         moteur_86idTemp  = moteur_86id;
        }
        String kmMin_87id=  request.getParameter("kmMin256");
        int kmMin_87idTemp  = Integer.parseInt(kmMin_87id);
        String kmMax_88id=  request.getParameter("kmMax258");
        int kmMax_88idTemp  = Integer.parseInt(kmMax_88id);
        String prixMin_89id=  request.getParameter("prixMin260");
        double prixMin_89idTemp  = Double.parseDouble(prixMin_89id);
        String prixMax_90id=  request.getParameter("prixMax262");
        double prixMax_90idTemp  = Double.parseDouble(prixMax_90id);
        services.Vehicule[] getVehiculesParDifferentsCriteres247mtemp = sampleGestionGarageServiceProxyid.getVehiculesParDifferentsCriteres(marque_84idTemp,modele_85idTemp,moteur_86idTemp,kmMin_87idTemp,kmMax_88idTemp,prixMin_89idTemp,prixMax_90idTemp);
if(getVehiculesParDifferentsCriteres247mtemp == null){
%>
<%=getVehiculesParDifferentsCriteres247mtemp %>
<%
}else{
        String tempreturnp248 = null;
        if(getVehiculesParDifferentsCriteres247mtemp != null){
        java.util.List listreturnp248= java.util.Arrays.asList(getVehiculesParDifferentsCriteres247mtemp);
        tempreturnp248 = listreturnp248.toString();
        }
        %>
        <%=tempreturnp248%>
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