<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
   
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <!-- Css -->
    <link rel="stylesheet" href="./css/style.css">
    <title>Room Rental</title>
    <style>
        .card{
            z-index: 0;
        }
        
    </style>
</head>
<body>
    <!-- Start Navbar -->
    <nav>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
              <a class="navbar-brand" href="/Home">Room Rental</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                  </li>
                </ul>
                <div class="Navbutton">
                  <li class="nav-item dropdown">
                    <a class="btn btn-primary dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Profile
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <a class="dropdown-item" id="popupBtn" href="#">Information</a>
                      <a class="dropdown-item" href="#">Another action</a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="./FinderSignup.html">Logout</a>
                    </div>
                  </li>
                </div>
              </div>
            </div>
          </nav>
    </nav>
    <!-- End Navbar -->
    <div id="popup" class="popup">
      <div class="popup-content">
          <span class="close">&times;</span>
          <p>This is a simple popup!</p>
          <h5>Name:-</h5>
          <h5>Mobile No:-</h5>
      </div>
  </div>
     <!-- Start Home Section -->
     <div class="row p-3">
        
            <!-- Software Engineer -->
              <div class="col-12 col-lg-3 col-sm-6 col-md-3 recard">
                <div class="card" style="width: 18rem;">
                    <img src="/Room 2.svg" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title"><b>Room finder</b></h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary">Contact</a>
                    </div>
                  </div>
                </div>
                 <!-- Software Engineer -->
              <div class="col-12 col-lg-3 col-sm-6 col-md-3 recard">
                <div class="card" style="width: 18rem;">
                    <img src="/Room 2.svg" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title"><b>Room finder</b></h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary">Contact</a>
                    </div>
                  </div>
            </div>
               <!-- Software Engineer -->
               <div class="col-12 col-lg-3 col-sm-6 col-md-3 recard">
                <div class="card" style="width: 18rem;">
                    <img src="Room 2.svg" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title"><b>Room finder</b></h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary">Contact</a>
                    </div>
                  </div>
            </div>
               <!-- Software Engineer -->
               <div class="col-12 col-lg-3 col-sm-6 col-md-3 pt-3">
                <div class="card" style="width: 18rem;">
                    <img src="./Room 2.svg" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title"><b>Room finder</b></h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary">Contact</a>
                    </div>
                  </div>
            </div>
    </div>

            </div>
     <!-- End Home Section -->
     <div id="popup" class="popup">
        <div class="popup-content">
            <span class="close">&times;</span>
            <p>This is a simple popup!</p>
        </div>
    </div>
<script>
    document.addEventListener('DOMContentLoaded', function () {
        var popupBtn = document.getElementById('popupBtn');
        var popup = document.getElementById('popup');
        var closeBtn = document.getElementsByClassName('close')[0];
    
        popupBtn.onclick = function() {
            popup.style.display = 'flex';
        }
    
        closeBtn.onclick = function() {
            popup.style.display = 'none';
        }
    
        window.onclick = function(event) {
            if (event.target == popup) {
                popup.style.display = 'none';
            }
        }
    });
</script>
     
<script src="Script.js"></script>

</body>
</html>