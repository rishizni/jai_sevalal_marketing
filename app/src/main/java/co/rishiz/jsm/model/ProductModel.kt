package co.rishiz.jsm.model

data class ProductModel (
    val productName:String?="",
    val productDescription:String?="",
    val productCoverImg:String?="",
    val productCategory:String?="",
    val productId:String?="",
    val productMrp:String?="",
    val productSp:String?="",
    val productImages:ArrayList<String> =ArrayList()

    )