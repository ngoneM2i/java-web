<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="reset.css">
    <!-- <link rel="stylesheet" href="mytube.css"> -->
    <!-- <link rel="stylesheet" href="mytubeVideo.css"> -->
    <title>mytubeDetail</title>
</head>

<body>

    <div class="container">

        <div class="titlebar">

            <div>
                <a href="" class="title__item_1">
                    <img src="img/subscrib.png" alt="" width="80px">
                </a>
            </div>
            <div>
                <a href="" class="title__item_2">
                    <img src="img/mytube.jpeg" alt="" width="80px">
                </a>
            </div>
            <div>
                <a href="" class="title__item_3">
                    <input type="search" alt="" placeholder="tapez votre texte ici" width="80px"></input>
                </a>
            </div>
            <div>
                <a href="" class="title__item_4">
                    <img src="img/search.png" alt="" width="50px">
                </a>
            </div>
        </div>


        <div class="detail_video">
           
            <div class="videos_detail_et_Comment">
                <div id="la_video_en_detail" class="videos__item">
                    <iframe width="700" height="300" src="https://www.youtube.com/embed/nsxFgyAzNu4" frameborder="0" allow="autoplay; encrypted-media"
                        allowfullscreen></iframe>
                    <!-- <iframe width="854" height="480" src="https://www.youtube.com/embed/t7xdvBN-y1g" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe> -->
                    <h5 class="videos__item__title">${videoDetail.source}</h5>
                    <p class="videos__item__tagline">${videoDetail.title}</p>
                    <span class "date_de_pub-video">${videoDetail.date}</span>
                </div>
                <span class="nbLike_video">${videoDetail.nbLikes}</div>
                <span class="nbDisLike_video">${videoDetail.nbDisLikes}</span></br>
                <span class="Author_video">${videoDetail.user}</span></br>
                <span class="source_video">${videoDetail.source}</span></br>
                <span class="titre_video"> ${videoDetail.title}</span></br>
                <span class="nbVue_video">${videoDetail.nbVues}</span></br>
                <h5 class="desc">
                  </br>${videoDetail.description}</br>
                </h5>

                <span class="nComment_video">${videoDetail.comment}</span>

                <div class="Ajout_Comments">
                    <form action="">
                        <p>
                            <input type="text" width="1000px" name="" placeholder="Ajouter un commentaire public" />
                            <a href="" class="valider_commeire">
                                <input type="submit" value="Ajouter un commentaire" />
                            </a>
                            <a href="" class="annuler_commeire">
                                <input type="submit" value="Cancel" />
                            </a>
                        </p>

                    </form>
                </div>
            </div>
        </div>
        <div class="colonne_video_lecture_auto">
            <div id="video4" class="videos__item">
                <img src="img/img_12.webp" alt="" class="videos__item__img">
                <h1 class="videos__item__title">${videoDetail.source}/h1>
                <p class="videos__item__tagline">${videoDetail.title}</p>
            </div>

            <div id="video4" class="videos__item">
                <img src="img/img_12.webp" alt="" class="videos__item__img">
                <h1 class="videos__item__title">${videoDetail.source}</h1>
                <p class="videos__item__tagline">${videoDetail.title}</p>
            </div>

            <div id="video4" class="videos__item">
                <img src="img/img_12.webp" alt="" class="videos__item__img">
                <h1 class="videos__item__title">${videoDetail.source}</h1>
                <p class="videos__item__tagline">${videoDetail.title}</p>
            </div>
        </div>
    </div>
</body>

</html>