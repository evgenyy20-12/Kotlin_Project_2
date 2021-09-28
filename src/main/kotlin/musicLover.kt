fun main() {
    val previousPurchaseAmount = 12000;
    val discount = 100;
    val discountStart1000 = 1001;
    val discountStart10000 = 10001;
    val newPurchaseAmount = 23781;
    var totalPrice = 0;
    var musicLover = false;

    if (previousPurchaseAmount >= discountStart10000) {
        totalPrice = (newPurchaseAmount / 100) * 95;
        musicLover = true;
    } else if (previousPurchaseAmount >= discountStart1000) {
        totalPrice = newPurchaseAmount - discount;
    } else {
        totalPrice = newPurchaseAmount;
    }
    if (musicLover) {
        totalPrice = (totalPrice / 100) * 99;
    }
    println("Итоговая стоимость: $totalPrice");
}