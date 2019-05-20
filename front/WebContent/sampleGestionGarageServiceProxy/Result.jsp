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
        String kilometrage_2id=  request.getParameter("kilometrage22");
        int kilometrage_2idTemp  = Integer.parseInt(kilometrage_2id);
        String estLoue_3id=  request.getParameter("estLoue24");
        boolean estLoue_3idTemp  = Boolean.valueOf(estLoue_3id).booleanValue();
        String anneeVehicule_4id=  request.getParameter("anneeVehicule26");
        int anneeVehicule_4idTemp  = Integer.parseInt(anneeVehicule_4id);
        String modele_5id=  request.getParameter("modele28");
            java.lang.String modele_5idTemp = null;
        if(!modele_5id.equals("")){
         modele_5idTemp  = modele_5id;
        }
        String immatriculation_6id=  request.getParameter("immatriculation30");
            java.lang.String immatriculation_6idTemp = null;
        if(!immatriculation_6id.equals("")){
         immatriculation_6idTemp  = immatriculation_6id;
        }
        String marque_7id=  request.getParameter("marque32");
            java.lang.String marque_7idTemp = null;
        if(!marque_7id.equals("")){
         marque_7idTemp  = marque_7id;
        }
        String couleur_8id=  request.getParameter("couleur34");
            java.lang.String couleur_8idTemp = null;
        if(!couleur_8id.equals("")){
         couleur_8idTemp  = couleur_8id;
        }
        String moteur_9id=  request.getParameter("moteur36");
            java.lang.String moteur_9idTemp = null;
        if(!moteur_9id.equals("")){
         moteur_9idTemp  = moteur_9id;
        }
        String prix_10id=  request.getParameter("prix38");
        double prix_10idTemp  = Double.parseDouble(prix_10id);
        String enVente_11id=  request.getParameter("enVente40");
        boolean enVente_11idTemp  = Boolean.valueOf(enVente_11id).booleanValue();
        String options_12id=  request.getParameter("options42");
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
case 44:
        gotMethod = true;
        services.Vehicule[] getVehicules44mtemp = sampleGestionGarageServiceProxyid.getVehicules();
if(getVehicules44mtemp == null){
%>
<%=getVehicules44mtemp %>
<%
}else{
        String tempreturnp45 = null;
        if(getVehicules44mtemp != null){
        java.util.List listreturnp45= java.util.Arrays.asList(getVehicules44mtemp);
        tempreturnp45 = listreturnp45.toString();
        }
        %>
        <%=tempreturnp45%>
        <%
}
break;
case 47:
        gotMethod = true;
        String prix_13id=  request.getParameter("prix50");
        double prix_13idTemp  = Double.parseDouble(prix_13id);
        services.Vehicule[] getVehiculesParPrix47mtemp = sampleGestionGarageServiceProxyid.getVehiculesParPrix(prix_13idTemp);
if(getVehiculesParPrix47mtemp == null){
%>
<%=getVehiculesParPrix47mtemp %>
<%
}else{
        String tempreturnp48 = null;
        if(getVehiculesParPrix47mtemp != null){
        java.util.List listreturnp48= java.util.Arrays.asList(getVehiculesParPrix47mtemp);
        tempreturnp48 = listreturnp48.toString();
        }
        %>
        <%=tempreturnp48%>
        <%
}
break;
case 52:
        gotMethod = true;
        String marque_14id=  request.getParameter("marque55");
            java.lang.String marque_14idTemp = null;
        if(!marque_14id.equals("")){
         marque_14idTemp  = marque_14id;
        }
        services.Vehicule[] getVehiculesParMarque52mtemp = sampleGestionGarageServiceProxyid.getVehiculesParMarque(marque_14idTemp);
if(getVehiculesParMarque52mtemp == null){
%>
<%=getVehiculesParMarque52mtemp %>
<%
}else{
        String tempreturnp53 = null;
        if(getVehiculesParMarque52mtemp != null){
        java.util.List listreturnp53= java.util.Arrays.asList(getVehiculesParMarque52mtemp);
        tempreturnp53 = listreturnp53.toString();
        }
        %>
        <%=tempreturnp53%>
        <%
}
break;
case 57:
        gotMethod = true;
        String kilometrage_16id=  request.getParameter("kilometrage62");
        int kilometrage_16idTemp  = Integer.parseInt(kilometrage_16id);
        String estLoue_17id=  request.getParameter("estLoue64");
        boolean estLoue_17idTemp  = Boolean.valueOf(estLoue_17id).booleanValue();
        String anneeVehicule_18id=  request.getParameter("anneeVehicule66");
        int anneeVehicule_18idTemp  = Integer.parseInt(anneeVehicule_18id);
        String modele_19id=  request.getParameter("modele68");
            java.lang.String modele_19idTemp = null;
        if(!modele_19id.equals("")){
         modele_19idTemp  = modele_19id;
        }
        String immatriculation_20id=  request.getParameter("immatriculation70");
            java.lang.String immatriculation_20idTemp = null;
        if(!immatriculation_20id.equals("")){
         immatriculation_20idTemp  = immatriculation_20id;
        }
        String marque_21id=  request.getParameter("marque72");
            java.lang.String marque_21idTemp = null;
        if(!marque_21id.equals("")){
         marque_21idTemp  = marque_21id;
        }
        String couleur_22id=  request.getParameter("couleur74");
            java.lang.String couleur_22idTemp = null;
        if(!couleur_22id.equals("")){
         couleur_22idTemp  = couleur_22id;
        }
        String moteur_23id=  request.getParameter("moteur76");
            java.lang.String moteur_23idTemp = null;
        if(!moteur_23id.equals("")){
         moteur_23idTemp  = moteur_23id;
        }
        String prix_24id=  request.getParameter("prix78");
        double prix_24idTemp  = Double.parseDouble(prix_24id);
        String enVente_25id=  request.getParameter("enVente80");
        boolean enVente_25idTemp  = Boolean.valueOf(enVente_25id).booleanValue();
        String options_26id=  request.getParameter("options82");
            java.lang.String options_26idTemp = null;
        if(!options_26id.equals("")){
         options_26idTemp  = options_26id;
        }
        %>
        <jsp:useBean id="services1Vehicule_15id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_15id.setKilometrage(kilometrage_16idTemp);
        services1Vehicule_15id.setEstLoue(estLoue_17idTemp);
        services1Vehicule_15id.setAnneeVehicule(anneeVehicule_18idTemp);
        services1Vehicule_15id.setModele(modele_19idTemp);
        services1Vehicule_15id.setImmatriculation(immatriculation_20idTemp);
        services1Vehicule_15id.setMarque(marque_21idTemp);
        services1Vehicule_15id.setCouleur(couleur_22idTemp);
        services1Vehicule_15id.setMoteur(moteur_23idTemp);
        services1Vehicule_15id.setPrix(prix_24idTemp);
        services1Vehicule_15id.setEnVente(enVente_25idTemp);
        services1Vehicule_15id.setOptions(options_26idTemp);
        sampleGestionGarageServiceProxyid.supprimerVehicule(services1Vehicule_15id);
break;
case 84:
        gotMethod = true;
        String mail_28id=  request.getParameter("mail89");
            java.lang.String mail_28idTemp = null;
        if(!mail_28id.equals("")){
         mail_28idTemp  = mail_28id;
        }
        String telephone_29id=  request.getParameter("telephone91");
            java.lang.String telephone_29idTemp = null;
        if(!telephone_29id.equals("")){
         telephone_29idTemp  = telephone_29id;
        }
        String nom_30id=  request.getParameter("nom93");
            java.lang.String nom_30idTemp = null;
        if(!nom_30id.equals("")){
         nom_30idTemp  = nom_30id;
        }
        String fonction_31id=  request.getParameter("fonction95");
            java.lang.String fonction_31idTemp = null;
        if(!fonction_31id.equals("")){
         fonction_31idTemp  = fonction_31id;
        }
        String matricule_32id=  request.getParameter("matricule97");
        int matricule_32idTemp  = Integer.parseInt(matricule_32id);
        String motDePasse_33id=  request.getParameter("motDePasse99");
            java.lang.String motDePasse_33idTemp = null;
        if(!motDePasse_33id.equals("")){
         motDePasse_33idTemp  = motDePasse_33id;
        }
        String prenom_34id=  request.getParameter("prenom101");
            java.lang.String prenom_34idTemp = null;
        if(!prenom_34id.equals("")){
         prenom_34idTemp  = prenom_34id;
        }
        %>
        <jsp:useBean id="services1Employe_27id" scope="session" class="services.Employe" />
        <%
        services1Employe_27id.setMail(mail_28idTemp);
        services1Employe_27id.setTelephone(telephone_29idTemp);
        services1Employe_27id.setNom(nom_30idTemp);
        services1Employe_27id.setFonction(fonction_31idTemp);
        services1Employe_27id.setMatricule(matricule_32idTemp);
        services1Employe_27id.setMotDePasse(motDePasse_33idTemp);
        services1Employe_27id.setPrenom(prenom_34idTemp);
        sampleGestionGarageServiceProxyid.supprimerEmploye(services1Employe_27id);
break;
case 103:
        gotMethod = true;
        String kilometrage_36id=  request.getParameter("kilometrage108");
        int kilometrage_36idTemp  = Integer.parseInt(kilometrage_36id);
        String estLoue_37id=  request.getParameter("estLoue110");
        boolean estLoue_37idTemp  = Boolean.valueOf(estLoue_37id).booleanValue();
        String anneeVehicule_38id=  request.getParameter("anneeVehicule112");
        int anneeVehicule_38idTemp  = Integer.parseInt(anneeVehicule_38id);
        String modele_39id=  request.getParameter("modele114");
            java.lang.String modele_39idTemp = null;
        if(!modele_39id.equals("")){
         modele_39idTemp  = modele_39id;
        }
        String immatriculation_40id=  request.getParameter("immatriculation116");
            java.lang.String immatriculation_40idTemp = null;
        if(!immatriculation_40id.equals("")){
         immatriculation_40idTemp  = immatriculation_40id;
        }
        String marque_41id=  request.getParameter("marque118");
            java.lang.String marque_41idTemp = null;
        if(!marque_41id.equals("")){
         marque_41idTemp  = marque_41id;
        }
        String couleur_42id=  request.getParameter("couleur120");
            java.lang.String couleur_42idTemp = null;
        if(!couleur_42id.equals("")){
         couleur_42idTemp  = couleur_42id;
        }
        String moteur_43id=  request.getParameter("moteur122");
            java.lang.String moteur_43idTemp = null;
        if(!moteur_43id.equals("")){
         moteur_43idTemp  = moteur_43id;
        }
        String prix_44id=  request.getParameter("prix124");
        double prix_44idTemp  = Double.parseDouble(prix_44id);
        String enVente_45id=  request.getParameter("enVente126");
        boolean enVente_45idTemp  = Boolean.valueOf(enVente_45id).booleanValue();
        String options_46id=  request.getParameter("options128");
            java.lang.String options_46idTemp = null;
        if(!options_46id.equals("")){
         options_46idTemp  = options_46id;
        }
        %>
        <jsp:useBean id="services1Vehicule_35id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_35id.setKilometrage(kilometrage_36idTemp);
        services1Vehicule_35id.setEstLoue(estLoue_37idTemp);
        services1Vehicule_35id.setAnneeVehicule(anneeVehicule_38idTemp);
        services1Vehicule_35id.setModele(modele_39idTemp);
        services1Vehicule_35id.setImmatriculation(immatriculation_40idTemp);
        services1Vehicule_35id.setMarque(marque_41idTemp);
        services1Vehicule_35id.setCouleur(couleur_42idTemp);
        services1Vehicule_35id.setMoteur(moteur_43idTemp);
        services1Vehicule_35id.setPrix(prix_44idTemp);
        services1Vehicule_35id.setEnVente(enVente_45idTemp);
        services1Vehicule_35id.setOptions(options_46idTemp);
        sampleGestionGarageServiceProxyid.locationVehicule(services1Vehicule_35id);
break;
case 130:
        gotMethod = true;
        services.Employe[] getEmployes130mtemp = sampleGestionGarageServiceProxyid.getEmployes();
if(getEmployes130mtemp == null){
%>
<%=getEmployes130mtemp %>
<%
}else{
        String tempreturnp131 = null;
        if(getEmployes130mtemp != null){
        java.util.List listreturnp131= java.util.Arrays.asList(getEmployes130mtemp);
        tempreturnp131 = listreturnp131.toString();
        }
        %>
        <%=tempreturnp131%>
        <%
}
break;
case 133:
        gotMethod = true;
        String kilometrage_48id=  request.getParameter("kilometrage138");
        int kilometrage_48idTemp  = Integer.parseInt(kilometrage_48id);
        String estLoue_49id=  request.getParameter("estLoue140");
        boolean estLoue_49idTemp  = Boolean.valueOf(estLoue_49id).booleanValue();
        String anneeVehicule_50id=  request.getParameter("anneeVehicule142");
        int anneeVehicule_50idTemp  = Integer.parseInt(anneeVehicule_50id);
        String modele_51id=  request.getParameter("modele144");
            java.lang.String modele_51idTemp = null;
        if(!modele_51id.equals("")){
         modele_51idTemp  = modele_51id;
        }
        String immatriculation_52id=  request.getParameter("immatriculation146");
            java.lang.String immatriculation_52idTemp = null;
        if(!immatriculation_52id.equals("")){
         immatriculation_52idTemp  = immatriculation_52id;
        }
        String marque_53id=  request.getParameter("marque148");
            java.lang.String marque_53idTemp = null;
        if(!marque_53id.equals("")){
         marque_53idTemp  = marque_53id;
        }
        String couleur_54id=  request.getParameter("couleur150");
            java.lang.String couleur_54idTemp = null;
        if(!couleur_54id.equals("")){
         couleur_54idTemp  = couleur_54id;
        }
        String moteur_55id=  request.getParameter("moteur152");
            java.lang.String moteur_55idTemp = null;
        if(!moteur_55id.equals("")){
         moteur_55idTemp  = moteur_55id;
        }
        String prix_56id=  request.getParameter("prix154");
        double prix_56idTemp  = Double.parseDouble(prix_56id);
        String enVente_57id=  request.getParameter("enVente156");
        boolean enVente_57idTemp  = Boolean.valueOf(enVente_57id).booleanValue();
        String options_58id=  request.getParameter("options158");
            java.lang.String options_58idTemp = null;
        if(!options_58id.equals("")){
         options_58idTemp  = options_58id;
        }
        %>
        <jsp:useBean id="services1Vehicule_47id" scope="session" class="services.Vehicule" />
        <%
        services1Vehicule_47id.setKilometrage(kilometrage_48idTemp);
        services1Vehicule_47id.setEstLoue(estLoue_49idTemp);
        services1Vehicule_47id.setAnneeVehicule(anneeVehicule_50idTemp);
        services1Vehicule_47id.setModele(modele_51idTemp);
        services1Vehicule_47id.setImmatriculation(immatriculation_52idTemp);
        services1Vehicule_47id.setMarque(marque_53idTemp);
        services1Vehicule_47id.setCouleur(couleur_54idTemp);
        services1Vehicule_47id.setMoteur(moteur_55idTemp);
        services1Vehicule_47id.setPrix(prix_56idTemp);
        services1Vehicule_47id.setEnVente(enVente_57idTemp);
        services1Vehicule_47id.setOptions(options_58idTemp);
        sampleGestionGarageServiceProxyid.achatVehicule(services1Vehicule_47id);
break;
case 160:
        gotMethod = true;
        String immatriculation_59id=  request.getParameter("immatriculation185");
            java.lang.String immatriculation_59idTemp = null;
        if(!immatriculation_59id.equals("")){
         immatriculation_59idTemp  = immatriculation_59id;
        }
        services.Vehicule getVehicule160mtemp = sampleGestionGarageServiceProxyid.getVehicule(immatriculation_59idTemp);
if(getVehicule160mtemp == null){
%>
<%=getVehicule160mtemp %>
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
if(getVehicule160mtemp != null){
%>
<%=getVehicule160mtemp.getKilometrage()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">estLoue:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
%>
<%=getVehicule160mtemp.isEstLoue()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">anneeVehicule:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
%>
<%=getVehicule160mtemp.getAnneeVehicule()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">modele:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
java.lang.String typemodele169 = getVehicule160mtemp.getModele();
        String tempResultmodele169 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemodele169));
        %>
        <%= tempResultmodele169 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">immatriculation:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
java.lang.String typeimmatriculation171 = getVehicule160mtemp.getImmatriculation();
        String tempResultimmatriculation171 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimmatriculation171));
        %>
        <%= tempResultimmatriculation171 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">marque:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
java.lang.String typemarque173 = getVehicule160mtemp.getMarque();
        String tempResultmarque173 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemarque173));
        %>
        <%= tempResultmarque173 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">couleur:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
java.lang.String typecouleur175 = getVehicule160mtemp.getCouleur();
        String tempResultcouleur175 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecouleur175));
        %>
        <%= tempResultcouleur175 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">moteur:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
java.lang.String typemoteur177 = getVehicule160mtemp.getMoteur();
        String tempResultmoteur177 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemoteur177));
        %>
        <%= tempResultmoteur177 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">prix:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
%>
<%=getVehicule160mtemp.getPrix()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">enVente:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
%>
<%=getVehicule160mtemp.isEnVente()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">options:</TD>
<TD>
<%
if(getVehicule160mtemp != null){
java.lang.String typeoptions183 = getVehicule160mtemp.getOptions();
        String tempResultoptions183 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeoptions183));
        %>
        <%= tempResultoptions183 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 187:
        gotMethod = true;
        String mail_61id=  request.getParameter("mail192");
            java.lang.String mail_61idTemp = null;
        if(!mail_61id.equals("")){
         mail_61idTemp  = mail_61id;
        }
        String telephone_62id=  request.getParameter("telephone194");
            java.lang.String telephone_62idTemp = null;
        if(!telephone_62id.equals("")){
         telephone_62idTemp  = telephone_62id;
        }
        String nom_63id=  request.getParameter("nom196");
            java.lang.String nom_63idTemp = null;
        if(!nom_63id.equals("")){
         nom_63idTemp  = nom_63id;
        }
        String fonction_64id=  request.getParameter("fonction198");
            java.lang.String fonction_64idTemp = null;
        if(!fonction_64id.equals("")){
         fonction_64idTemp  = fonction_64id;
        }
        String matricule_65id=  request.getParameter("matricule200");
        int matricule_65idTemp  = Integer.parseInt(matricule_65id);
        String motDePasse_66id=  request.getParameter("motDePasse202");
            java.lang.String motDePasse_66idTemp = null;
        if(!motDePasse_66id.equals("")){
         motDePasse_66idTemp  = motDePasse_66id;
        }
        String prenom_67id=  request.getParameter("prenom204");
            java.lang.String prenom_67idTemp = null;
        if(!prenom_67id.equals("")){
         prenom_67idTemp  = prenom_67id;
        }
        %>
        <jsp:useBean id="services1Employe_60id" scope="session" class="services.Employe" />
        <%
        services1Employe_60id.setMail(mail_61idTemp);
        services1Employe_60id.setTelephone(telephone_62idTemp);
        services1Employe_60id.setNom(nom_63idTemp);
        services1Employe_60id.setFonction(fonction_64idTemp);
        services1Employe_60id.setMatricule(matricule_65idTemp);
        services1Employe_60id.setMotDePasse(motDePasse_66idTemp);
        services1Employe_60id.setPrenom(prenom_67idTemp);
        sampleGestionGarageServiceProxyid.ajouterEmploye(services1Employe_60id);
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