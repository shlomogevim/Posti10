package com.sg.posti10.posts

import com.sg.posti10.*

class Posts11Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

      fun loadPost1100(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/19/47/hand-845269_960_720.jpg"
            postText = arrayListOf(
                " אפשר להשתמש בחיים בתור פסיכולוג  ",
                " ולספר להם כמה רע לך וכמה אתה מסכן, ",
                " אפשר להשתמש בחיים בתור סידור עבודה ",
                " ולסדר בהם לעצמך סידרת מטלות אינסופית, ",
                " אפשר להשתמש בחיים בתור מצפן ",
                " ולחפש בהם את עצמך בכל הכיוונים, ",
                " אפשר להשתמש בחיים כתפקיד בהצגה ",
                "  ולעשות בהם תמיד את כל מה שמצפים ממך,  ",
                " אפשר להשתמש בחיים בתור מוסיקה ",
                " ולחפש בהם את המילים המתאימות למראות, ",
                " אבל הכי כדאי לחיות אותם. "
            )
             postTransparency =10
            postTextSize = arrayListOf(0,12)
            margin=0
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost12(postNum,imageUri,postText,postTransparency,postTextSize,margin)
        }
        return post
    }
    /*
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"

    }*/





 }