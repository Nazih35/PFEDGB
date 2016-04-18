<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"  %>
<h2>Ajouter Utilisateur</h2>

<div id="formUser">
<f:form modelAttribute="user" action="saveUser" method="post">
<table>
<tr>
<td>Nom :</td>
<td><f:input path="nom"/></td>
<td><f:errors path="nom" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Prénom :</td>
<td><f:input path="prenom"/></td>
<td><f:errors path="prenom" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Division :</td>
<td>
<f:select path="division">
<f:option value="DG">Division 1</f:option>
<f:option value="DG">Division 2</f:option>
<f:option value="DG">Division 3</f:option>
<f:option value="DG">Division 4</f:option>
</f:select>
</td>
<td><f:errors path="division" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Direction :</td>
<td>
<f:select path="direction">
<f:option value="DG">Direction 1</f:option>
<f:option value="DG">Direction 2</f:option>
<f:option value="DG">Direction 3</f:option>
<f:option value="DG">Direction 4</f:option>
</f:select>
</td>
<td><f:errors path="direction" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Sous Direction :</td>
<td>
<f:select path="sousdirection">
<f:option value="DG">SousDirection 1</f:option>
<f:option value="DG">SousDirection 2</f:option>
<f:option value="DG">SousDirection 3</f:option>
<f:option value="DG">SousDirection 4</f:option>
</f:select>
</td>
<td><f:errors path="sousdirection" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Etage :</td>
<td>
<f:select path="etage">
<f:option value="0">0</f:option>
<f:option value="1">1</f:option>
<f:option value="2">2</f:option>
<f:option value="3">3</f:option>
<f:option value="4">4</f:option>
<f:option value="5">5</f:option>
<f:option value="6">6</f:option>
<f:option value="7">7</f:option>
<f:option value="8">8</f:option>
<f:option value="9">9</f:option>
<f:option value="10">10</f:option>
</f:select>
</td>
<td><f:errors path="etage" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Zone :</td>
<td>
<f:select path="zone">
<f:option value="a">a</f:option>
<f:option value="b">b</f:option>
<f:option value="c">c</f:option>
<f:option value="d">d</f:option>
<f:option value="e">e</f:option>
<f:option value="f">f</f:option>

</f:select>
</td>
<td><f:errors path="zone" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Email :</td>
<td><f:input path="email" type="email"/></td>
<td><f:errors path="email" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Username :</td>
<td><f:input path="username" /></td>
<td><f:errors path="username" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td>Mot de passe :</td>
<td><f:input path="motdepasse" type="password"/></td>
<td><f:errors path="motdepasse" cssClass="errors"></f:errors></td>
</tr>

<tr>
<td ><input type="submit" value="Enregistrer"></td>
</tr>
</table>
</f:form>
</div>
