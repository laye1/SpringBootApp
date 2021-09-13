
<%@include file="../common/header.jspf"%>  

<%@include file="../common/navbar.jspf"%>


<center><h1>ADD NEWS LAPTOPS</h1></center>

<div class="container">
<form action="/addlist" method="post">
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">MARK</label>
    <div class="col-sm-10">
      <input type="text" name="mark" class="form-control form-control-lg" id="colFormLabelLg" placeholder="mark">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">MODEL</label>
    <div class="col-sm-10">
      <input type="text" name="model" class="form-control form-control-lg" id="colFormLabelLg" placeholder="model">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">DESCRIPTION</label>
    <div class="col-sm-10">
      <input type="text" name="description" class="form-control form-control-lg" id="colFormLabelLg" placeholder="description">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">PRICE</label>
    <div class="col-sm-10">
      <input type="text" name="price" class="form-control form-control-lg" id="colFormLabelLg" placeholder="price">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">PICTURE</label>
    <div class="col-sm-10">
      <input type="text" name="picture" class="form-control form-control-lg" id="colFormLabelLg" placeholder="picture">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">VALIDER</button>
</form>
</div>

<%@include file="../common/footer.jspf"%>

