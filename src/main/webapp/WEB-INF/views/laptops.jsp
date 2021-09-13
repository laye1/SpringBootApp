<%@include file="../common/header.jspf"%>
<%@include file="../common/navbar.jspf"%>


<center><h1><p>LIST OF LAPTOPS</p></h1><center>


<div class="container">
  
<table class="table">
  <thead>
  
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Mark</th>
      <th scope="col">Model</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Image</th>
      <th scope="col"></th>
      
    </tr>
    
  </thead>
  <tbody>
<c:forEach items="${laptops }" var="laptop">
    <tr>
      <th scope="row">${laptop.id }</th>
      <td>${laptop.mark }</td>
      <td>${laptop.model}</td>
      <td>${laptop.description}</td>
      <td>${laptop.price}</td>
      <td><img src="${laptop.picture}" width="20px" height="30px"></img></td>
      <td><a href="/delete?id=${laptop.id}"><button  class="btn btn-danger">delete</button></a></td>
      <td><a href="/update?id=${laptop.id}"><button  class="btn btn-primary">update</button></a></td>
   
      </tr>
 
    </c:forEach>
    </tbody>
    </table>
    </div>
    
     <a href="/addlist"> <button type="submit" class="btn btn-primary">  AJOUTER</button></a>
  
  
  <%@include file="../common/footer.jspf"%>