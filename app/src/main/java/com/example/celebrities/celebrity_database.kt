package com.example.celebrities

class celebrity_database {

    var celebrityList:ArrayList<celebrity>?= ArrayList()

    constructor()
    {
        celebrityList = ArrayList()

        celebrityList?.add(celebrity("Angelina Jolie","Angelina Jolie is an American Actress",R.drawable.angelina_jolie,true))
        celebrityList?.add(celebrity("Audrey Hepburn","Audrey Hepburn was an British Actress",R.drawable.audrey_hepburn,false))
        celebrityList?.add(celebrity("Brad Pitt","Brad Pitt is an American actor",R.drawable.brad_pitt,true))
        celebrityList?.add(celebrity("Elizabeth Taylor","Elizabeth Taylor was a British-American Actress",R.drawable.elizabeth_taylor,false))
        celebrityList?.add(celebrity("Ingrid Bergman","Ingrid Bergman was a Swedish Actor",R.drawable.ingrid_bergman,false))
        celebrityList?.add(celebrity("James Stewart","James Stewart was an American Actor",R.drawable.james_stewart,false))
        celebrityList?.add(celebrity("Marilyn Monroe","Marilyn Monroe was an American Actress",R.drawable.marilyn_monroe,false))


    }
}