<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <header class="content">
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <!-- Slide One - Set the background image for this slide in the line below -->
         <div class="carousel-item active">
           <img src="<c:url value='/static/images/slider1.jpeg'></c:url>" alt="...">
           <div class="gradient"></div>
           <div class="carousel-caption">
           <h3>Bangladesh Railway</h3>
              <h1>Hello we are here to infrom you about Railway service</h1>
              <h2>More beautiful arrangement </h2>
              <h5>We are here to give information about railway of Bangladesh</h5>
            </div>
          </div>
          <!-- Slide Two - Set the background image for this slide in the line below -->
         <div class="carousel-item">
           <img src="<c:url value='/static/images/slider2.jpg'></c:url>" alt="...">
           <div class="gradient"></div>
           <div class="carousel-caption">
             <h3>Bangladesh Railway</h3>
              <h1>Hello we are here to infrom you about Railway service</h1>
              <h2>More beautiful arrangement </h2>
              <h5>We are here to give information about railway of Bangladesh</h5>
              
            </div>
          </div>
          <!-- Slide Three - Set the background image for this slide in the line below -->
         <div class="carousel-item">
           <img src="<c:url value='/static/images/slider3.jpg'></c:url>" alt="...">
           <div class="gradient"></div>
           <div class="carousel-caption">
           <h3>Bangladesh Railway</h3>
              <h1>Hello we are here to infrom you about Railway service</h1>
              <h2>More beautiful arrangement </h2>
              <h5>We are here to give information about railway of Bangladesh</h5>
            </div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    </header>