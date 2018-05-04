<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="mytube.css">
    <title>mytube home</title>
</head>

<body>
 
    <div class="container">

        <div class="titlebar">
            <div class="titre_entete">
            <div><a href="" class="title__item_1"><img src="img/subscrib.png" alt="" width="80px" ></a> </div >
            <div><a href=""  class="title__item_2"><img src="img/mytube.jpeg" alt="" width="80px"></a> </div >
            <div><a href="" class="title__item_3"><input type="search" alt="" placeholder="tapez votre texte ici" width="80px"></input></a></div >
            <div><a href="" class="title__item_4"><img src="img/search.png" alt="" width="50px"></a> </div >
            </div>
        </div>

        <div class="detail_video">
            <div class="source_video">${video.source}</div>
            <div class="titre_video">${video.title}</div>
            <div class="nbVue_video">${video.nbVues}</div>
            <h3 class="desc">${video.description}</h3>
            <div class"date_de_pub-video">${video.datePub}<</div>
            <div class="videos_detail_et_Comment">
                <div id="la_video_en_detail"  class="videos__item">
                    <iframe width="854" height="480" src="https://www.youtube.com/embed/t7xdvBN-y1g" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                    <h1 class="videos__item__title">${video.source}</h1>
                    <p class="videos__item__tagline">${video.title}</p>
                </div>
        
                <div class="Comments">
                    <form action="">
                        <p>
                            <input type="text" width ="1000px" name="" placeholder="Ajouter un commentaire public" />
                            <a href=""class="valider_commeire" ><input type="submit" value="Ajouter un commentaire"/></a>
                            <a href=""class="annuler_commeire"> <input type="submit" value="Cancel"/></a>
                        </p>
                        
                    </form>
                </div>
                          
        <div class="colonne_video_lecture_auto">    
            <div id="video4" class="videos__item">
                <img src="img/img_12.webp" alt="" class="videos__item__img">
                <h1 class="videos__item__title">${video.source}</h1>
                <p class="videos__item__tagline">${video.title}e</p>
            </div>  

            <div id="video4" class="videos__item">
                <img src="img/img_12.webp" alt="" class="videos__item__img">
                <h1 class="videos__item__title">${video.source}</h1>
                <p class="videos__item__tagline">${video.title}</p>
            </div>

            <div id="video4" class="videos__item">
                <img src="img/img_12.webp" alt="" class="videos__item__img">
                <h1 class="videos__item__title">${video.source}</h1>
                <p class="videos__item__tagline">${video.title}</p>
            </div>
        </div>
    </div>
</body>
</html>

