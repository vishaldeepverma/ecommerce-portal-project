<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<style>
.mendi-social-networks {
    width: 100%;
    margin: 0;
}
.mendi-social-networks li {
	float: left;
	display: inline;
	width: 25%;	
	color: #ffffff;
	position: relative;
} 
.mendi-social-networks li i {
	font-size: 50px;
	float: left;
	width: 60px;
}
.mendi-social-networks li a {
	color: #ffffff;
	padding: 25px 65px 25px 40px;
	float: left;
	width: 100%;
	box-sizing: border-box;
    
}
.mendi-social-networks li a:hover {
     text-decoration:none;    
}
.mendi-social-networks li p {
	font-size: 13px;
	font-weight: 600;
	letter-spacing: 0.5px;
	text-transform: uppercase;
	margin: 2px 0 0px;
}
.mendi-social-networks li .followers {
	text-transform: uppercase;
}
.mendi-social-networks li:before {
	position: absolute;
	content: "\f105";
	right: 30px;
	top: 0;
	bottom: 0;
	height: 30px;
	width: 30px;
	border: 1px solid #ffffff;
	border-radius: 30px;
	margin: auto;
	font-size: 18px;
	font-family: FontAwesome;
	color: #ffffff;
	text-align: center;
	line-height: 26px;
}
.mendi-social-networks li:hover:before {
	background-color: #ffffff;
	color: #999999;
}
.mendi-social-networks li.facebook {
	background-color: #4d6bab;
}
.mendi-social-networks li.twitter {
	background-color: #4ec6f8;
}
.mendi-social-networks li.googleplus {
	background-color: #d34836;
}
.mendi-social-networks li.linkedin {
	background-color: #248cc9;
}
</style>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
	<div class="row">
	<div class="col-lg-12">
		<ul class="mendi-social-networks">
    	<li class="facebook">
			<a href="" title="">
				<i class="fa fa-facebook"> </i>
				<p>JOIN US ON FACEBOOK</p>
				<span class="followers">268K Followers</span>
			</a>
		</li>
		<li class="twitter">
			<a href="" title="">
				<i class="fa fa-twitter"> </i>
				<p>FOLLOW US ON TWITTER</p>
				<span class="followers">268K Followers</span>
			</a>
		</li>
		<li class="googleplus">
			<a href="" title="">
				<i class="fa fa-google-plus"> </i>
				<p>ADD TO OUR CIRCLE</p>
				<span class="followers">268K Followers</span>
			</a>
		</li>
		<li class="linkedin">
			<a href="" title="">
				<i class="fa fa-linkedin"> </i>
				<p>CONNECT TO OUR NETWORK</p>
				<span class="followers">268K Followers</span>
			</a>
		</li>
	</ul>
	</div>
</div>
</body>
</html>