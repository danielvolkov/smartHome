<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title>MySmartHome</title>
	<meta name="description" content="Pi House">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="<c:url value="/resources/css/stylemain.css"/> " rel="stylesheet" type="text/css">
</head>

<body>
	<header>
		<img src="<c:url value="/resources/images/lego.png"/> ">
		SMART HOME by D <strong></strong>
		<div class="pubnub"></div>
	</header>
	<section class="container">

		<section class="temp-hum-display">
			<section class="temp-container">
				<div class="temp" data-temperature="${temperature}"><span> ℃</span></div>
			</section>
			<section class="hum-container">
				<div class="hum" data-humidity="${humidity}"><span class="fa wet"> &#37;</span></div>
			</section>
		</section>

		<section class="pref-container">
			<section class="preference">
				<div>
					<div class="caption">Light</div>
					<label for="door">
						<input id="door" type="checkbox">
						<div class="toggle-button">
							<div class="switch"></div>
						</div>
					</label>
				</div>

				<div>
					<div class="caption">Living Room Light</div>
					<label class="brightness fa">
						<input id="lightLiving" type="range" min="0" max="10" step="1" value="0">
					</label>
				</div>
				
				<div>
					<div class="caption">Porch Light</div>
					<label class="brightness fa">
						<input id="lightPorch" type="range" min="0" max="10" step="1" value="0">
					</label>
				</div>

				<div>
				<!-- flickering light -->
					<div class="caption">Fireplace</div>
					<label class="brightness fire fa">
						<input id="fireplace" type="range" min="0" max="10" step="1" value="0">
					</label>
				</div>

			</section>

		</section>

	</section>

	<footer>

	</footer>


</body>
</html>
