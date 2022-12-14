<!doctype html>
<html lang="en">
<head>
    <title>Currency Converter</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h2 style="text-align: center">Currency Converter</h2>
<form method="post">
    <div class="form-group">
        <label for="rate">Rate :</label>
        <input type="number" class="form-control" name="rate" placeholder="Enter rate" id="rate">
    </div>
    <div class="form-group">
        <label for="usd">USD:</label>
        <input type="number" class="form-control" name="usd" placeholder="Enter USD" id="usd">
    </div>
    <button type="submit" class="btn btn-primary html-editor-align-center " >Submit</button>
</form>
<br><br><br>
<div>
    <h2 style="text-align: center">RESULT</h2>
    <div class="form-group">
        <label for="rater">Rate:</label>
        <input type="number" class="form-control" value="${rate}" id="rater">
    </div>
    <div class="form-group">
        <label for="usdr">USD:</label>
        <input type="number" class="form-control" value="${usd}" id="usdr">
    </div>
    <div class="form-group">
        <label for="vndr">VNĐ:</label>
        <input type="number" class="form-control" value="${vnd}" id="vndr">
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
