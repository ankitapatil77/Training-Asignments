<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list-Product</title>

</head>
<body>
	<div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Shopping Cart Application</h2>
   <hr />

   <input type="button" value="Add Product"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Product List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>Book id</th>
       <th>Book Name</th>
       <th>Author</th>
       <th>Price</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempProduct" items="${Product}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/product/updateForm">
        <c:param name="book_id" value="${tempProduct.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/customer/delete">
        <c:param name="book_id" value="${tempProduct.id}" />
       </c:url>
       <tr>
        <td>${tempProduct.book_id}</td>
        <td>${tempProduct.book_Name}</td>
        <td>${tempProduct.author}</td>
        <td>${tempProduct.price}</td>	
        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
        </td>
       </tr>
      </c:forEach>
     </table>
    </div>
   </div>
  </div>
 </div>
</body>
</html>