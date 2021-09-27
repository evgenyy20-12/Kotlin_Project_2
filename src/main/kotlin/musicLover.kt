fun main() {
    val previousPurchaseAmount = 12000;
    val discount = 100;
    val discountStart1000 = 1001;
    val discountStart10000 = 10001;
    val newPurchaseAmount = 23781;
    var totalPrice = 0;

    if (previousPurchaseAmount >= discountStart10000) {
        totalPrice = (newPurchaseAmount / 100) * 95;
        totalPrice = (totalPrice / 100) * 99;
        println("Итоговая стоимость: $totalPrice");
    } else if (previousPurchaseAmount >= discountStart1000) {
        totalPrice = newPurchaseAmount - discount;
        println("Итоговая стоимость: $totalPrice");
    }else {
        println("Итоговая стоимость: $newPurchaseAmount");
    }
}