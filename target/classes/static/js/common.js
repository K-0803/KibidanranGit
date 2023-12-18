// 子育て拠点
$(function() {
    $(".A").click(function() {
        $(".B").slideToggle("");
    });
});

$(function() {
    $(".C").click(function() {
        $(".D").slideToggle("");
    });
});

$(function() {
    $(".E").click(function() {
        $(".F").slideToggle("");
    });
});

$(function() {
    $(".G").click(function() {
        $(".H").slideToggle("");
    });
});

$(function() {
    $(".I").click(function() {
        $(".J").slideToggle("");
    });
});

$(function() {
    $(".K").click(function() {
        $(".L").slideToggle("");
    });
});

$(function() {
    $(".N").click(function() {
        $(".M").slideToggle("");
    });
});

$(function() {
    $(".O").click(function() {
        $(".P").slideToggle("");
    });
});

$(function() {
    $(".Q").click(function() {
        $(".R").slideToggle("");
    });
});

$(function() {
    $(".S").click(function() {
        $(".T").slideToggle("");
    });
});

$(function() {
    $(".U").click(function() {
        $(".V").slideToggle("");
    });
});

$(function() {
    $(".W").click(function() {
        $(".X").slideToggle("");
    });
});

$(function() {
    $(".Y").click(function() {
        $(".Z").slideToggle("");
    });
});

$(function() {
    $(".A1").click(function() {
        $(".B1").slideToggle("");
    });
});

$(function() {
    $(".C1").click(function() {
        $(".D1").slideToggle("");
    });
});

$(function() {
    $(".E1").click(function() {
        $(".F1").slideToggle("");
    });
});

$(function() {
    $(".G1").click(function() {
        $(".H1").slideToggle("");
    });
});

$(function() {
    $(".I1").click(function() {
        $(".J1").slideToggle("");
    });
});

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
        
        var selectedAmount = amountMapping[`${selectedFrom}-${selectedTo}`] || "ー";
    
        amountElement.textContent = '金額: ' + selectedAmount + '円';
        
    }
        selectFrom.addEventListener('change', updateAmount);
        selectTo.addEventListener('change', updateAmount);
    
        updateAmount();
});