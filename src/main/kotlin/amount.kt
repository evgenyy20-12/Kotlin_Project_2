fun main() {
    val transferAmount = 321344;
    val commission = 0.75;
    val minimumCommission = 3500;
    val commissionForTranslation = transferAmount * commission;
    var cardTransferCommission = 0;
    if (commissionForTranslation < minimumCommission) {
        cardTransferCommission = minimumCommission;
    } else {
        cardTransferCommission = commissionForTranslation.toInt();
    }
    println("Комиссия за перевод: $cardTransferCommission копеек!");
}