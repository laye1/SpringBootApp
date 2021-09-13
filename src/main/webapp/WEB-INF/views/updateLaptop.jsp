<%@include file="../common/header.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 

<%@include file="../common/navbar.jspf"%>

<style>
    body {
            color: #566787;
            background: #f5f5f5;
            font-family: 'Varela Round', sans-serif;
            font-size: 13px;
        }
</style>

<section>
	<div class="container">
		<div align="center" class="mt-4 mb-4">
		         
				 
		</div>
		<div class="col-md-8 m-auto">
		   <div class="card">
			   <div class="card-body">
			        <form:form class="row g-3" method="post" action="/update?id=${laptop.id }" modelAttribute="laptop">
			            <div class="col-md-6 mt-2">
							<form:label path="mark" >Mark</form:label>
							<form:input path="mark"  class="form-control" />
					    </div> 
					    <div class="col-md-6 mt-2">
							<form:label path="model" class="form-label">Model</form:label>
							<form:input path="model" class="form-control" />
					    </div>
					    <div class="col-md-6 mt-2">
							<form:label path="description" class="form-label">Description</form:label>
							<form:input path="description" class="form-control" />
					    </div>
					    <div class="col-md-6 mt-2">
							<form:label path="price" class="form-label">Price</form:label>
							<form:input path="price" class="form-control" />
					    </div>
					 
					  
					    <div class="col-12 mt-2">
							<form:label path="picture" class="form-label">Picture Url</form:label>
							<form:input path="picture" class="form-control" />
					    </div>
					    
                         
						 
			            <div class="col-12 mt-3">
			               <button onclick="return confirm('Are you sure!')" type="submit" class="btn btn-success">Save Change</button>
			            </div>
			        </form:form>
			   </div>
		   </div>
		   
		</div>
	</div>
</section>

<%@ include file="../common/footer.jspf" %>