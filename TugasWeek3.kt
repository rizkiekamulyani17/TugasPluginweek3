fun main(){
    //Soal no 1
    val min = 500_000
    val beli = 625_000
    val diskonMember = beli * 5 / 100
    val diskonBeli = beli * 10 / 100
    val totalDiskon = diskonMember + diskonBeli

    if (beli >= min){
        var total = beli - diskonMember - diskonBeli
        println("Pembeli 1 mendapatkan diskon 15% dari $beli, jadi totalnya = $beli - $totalDiskon = $total")
    }else if(beli <= min){
        var total = beli - diskonMember - diskonBeli
        println("Pembeli 1 Mendapatkan diskon 5% dari $beli, jadi totalnya : $beli - $totalDiskon = $total")
    }
    //Soal 2
    var beratBadan = 47
    var tinggiBadan = 154

    if (tinggiBadan - 110 == beratBadan){
        println("Normal")
    }else if(tinggiBadan - 100 >= beratBadan ){
        println("Gemuk")
    }else if(tinggiBadan - 100<=beratBadan ){
        println("Kurus")
    }


}