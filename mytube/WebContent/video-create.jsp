<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="reset.css">
    <title>Création de vidéo</title>
</head>

<body>
<form action="http://localhost:8080/mytube/video-create.jsp" method="POST" id="video-create">
        <div>
            <label for="title">titre de la video</label>
            <input type="text" name="title" id="title" value="${title}"> 
        </div>
        <div>
            <label for="source">source</label>
            <input type="text" name="source" id="source" value="${source}">
        </div>
        <div>
            <label for="description">description</label>
            <input type="text" name="description" id="description" value="${description}">
        </div>
        <div>
            <label for="author">author</label>
            <input type="text" name="author" id="author" value="${author}">
        </div>
        <div>
            <label for="comment-content">commentaire</label>
            <textarea name="" id="comment-content" cols="30" rows="10" value="${commentaire}"></textarea> 
            <input type="submit" placeholder="Ajouter votre commentaire" value="Ajouter votre commentaire" name="" >
            <input type="submit" value="Annuler">   
        </div>
        <div>
            <label for="datePub">datePub</label>
            <input type="text" name="datePub" id="datePub">
        </div>
        <div>
            <label for="nbVues">nbVues</label>
            <input type="text" name="nbVues" id="nbVues">
        </div>
        <div>
            <label for="nbLikes">nbDisLikes</label>
            <input type="text" name="nbDisLikes" id="nbDisLikes">
        </div>
        <div>
            <label for="nbLikes">nbDisLikes</label>
            <input type="text" name="nbDisLikes" id="nbLikes">
        </div>
        <div>
            <input type="submit" value="ajouter une video">
        </div>

   </form>
</body>

</html>