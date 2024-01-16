<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Data</title>
</head>
<body>
	<h1>Update Data</h1>

	<form action="EditServlet" method="POST">
		<!-- Form fields -->
		<label for="slNo">Sl_No:</label> <input type="number" id="slNo"
			name="slNo" required><br>
		<br> <label for="customerOrderId">Customer Order ID:</label> <input
			type="number" id="customerOrderId" name="customerOrderId" required><br>
		<br> <label for="salesOrg">Sales Organization:</label> <input
			type="number" id="salesOrg" name="salesOrg" required><br>
		<br> <label for="distributionChannel">Distribution
			Channel:</label> <input type="text" id="distributionChannel"
			name="distributionChannel" required><br>
		<br> <label for="division">Division:</label> <input type="text"
			id="division" name="division" required><br>
		<br> <label for="releasedCreditValue">Released Credit
			Value:</label> <input type="number" id="releasedCreditValue"
			name="releasedCreditValue" required><br>
		<br> <label for="purchaseOrderType">Purchase Order Type:</label>
		<input type="text" id="purchaseOrderType" name="purchaseOrderType"
			required><br>
		<br> <label for="companyCode">Company Code:</label> <input
			type="number" id="companyCode" name="companyCode" required><br>
		<br> <label for="orderCreationDate">Order Creation Date:</label>
		<input type="text" id="orderCreationDate" name="orderCreationDate"
			required><br>
		<br> <label for="orderCreationTime">Order Creation Time:</label>
		<input type="text" id="orderCreationTime" name="orderCreationTime"
			required><br>
		<br> <label for="creditControlArea">Credit Control Area:</label>
		<input type="text" id="creditControlArea" name="creditControlArea"
			required><br>
		<br> <label for="soldToParty">Sold To Party:</label> <input
			type="number" id="soldToParty" name="soldToParty" required><br>
		<br> <label for="orderAmount">Order Amount:</label> <input
			type="number" id="orderAmount" name="orderAmount" required><br>
		<br> <label for="requestedDeliveryDate">Requested
			Delivery Date:</label> <input type="text" id="requestedDeliveryDate"
			name="requestedDeliveryDate" required><br>
		<br> <label for="orderCurrency">Order Currency:</label> <input
			type="text" id="orderCurrency" name="orderCurrency" required><br>
		<br> <label for="creditStatus">Credit Status:</label> <input
			type="text" id="creditStatus" name="creditStatus" required><br>
		<br> <label for="customerNumber">Customer Number:</label> <input
			type="number" id="customerNumber" name="customerNumber" required><br>
		<br> <label for="amountInUSD">Amount in USD:</label> <input
			type="number" id="amountInUSD" name="amountInUSD" required><br>
		<br> <label for="uniqueCustID">Unique Customer ID:</label> <input
			type="number" id="uniqueCustID" name="uniqueCustID" required><br>
		<br> <input type="submit" value="Update Data">
	</form>

</body>
</html>
