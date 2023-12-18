document.addEventListener('DOMContentLoaded', function() {
// DOM要素の参照を取得
var selectFrom = document.querySelector('.selectbox-1 select');
var selectTo = document.querySelector('.selectbox-2 select');
var amountElement = document.querySelector('.total p');

var amountMapping = {
    'yoji-st-yoji-fn': "4,812,845", // 託児所入所～託児所卒業
    'yoji-st-jido-fn': "9,514,865", // 託児所入所～小学校卒業
    'yoji-st-gaki-fn': "12,919,876", // 託児所入所～中学校卒業

    'jido-st-jido-fn': "4,702,020", // 小学校入学～小学校卒業
    'jido-st-gaki-fn': "8,107,031", // 小学校入学～中学校卒業
};

function updateAmount(){
    var selectedFrom = selectFrom.value;
    var selectedTo = selectTo.value;
    
    var selectedAmount = amountMapping[`${selectedFrom}-${selectedTo}`] || "0";

    amountElement.textContent = '金額: ' + selectedAmount + '円';
    
}
    selectFrom.addEventListener('change', updateAmount);
    selectTo.addEventListener('change', updateAmount);

});