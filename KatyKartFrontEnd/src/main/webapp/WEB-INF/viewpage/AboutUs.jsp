
<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>AboutUS</title>

   <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
   <style>
   body {
    padding-top: 70px; /* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
}

.img-center {
	margin: 0 auto;
}

footer {
    margin: 50px 0;
}

   
   </style>

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li>
                        <a href="ContactUs">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <!-- Introduction Row -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">About Us
                    <small>Hey !! There..Thanks for visiting</small>
                </h1>
                <p>This is my First Website. I believe in simple living and high thinking. Further more projects to come. Thanks for visiting !!</p>
            </div>
        </div>

        <!-- Team Members Row -->
        <div class="row">
            <div class="col-lg-12">
                <h2 class="page-header">Our Team</h2>
            </div>
            <div class="col-lg-4 col-sm-6 text-center">
                <img class="img-circle img-responsive img-center" src="data:image/jpeg;base64,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" alt="">
                <h3>VISHAL DEEP VERMA             
                </h3>
               
            </div>
                   </div>

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Katy-Kart 2017</p>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->

   

</body>

</html>
