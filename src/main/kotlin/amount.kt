fun main() {
    val transferAmount = 32134;
    val commission = 0.75;
    val minimumCommission = 3500;
    val commissionForTranslation = transferAmount * commission;

    if (commissionForTranslation < minimumCommission) {
        println("Комиссия за перевод: $minimumCommission");
    } else {
        println("Комиссия за перевод: $commissionForTranslation");
    }
}