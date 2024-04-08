/*  ---------------------------------------------------
    Template Name: Sona
    Description: Sona Hotel Html Template
    Author: Colorlib
    Author URI: https://colorlib.com
    Version: 1.0
    Created: Colorlib
---------------------------------------------------------  */

'use strict';

(function ($) {

    /*------------------
        Preloader
    --------------------*/
    $(window).on('load', function () {
        $(".loader").fadeOut();
        $("#preloder").delay(200).fadeOut("slow");
    });

    /*------------------
        Background Set
    --------------------*/
    $('.set-bg').each(function () {
        var bg = $(this).data('setbg');
        $(this).css('background-image', 'url(' + bg + ')');
    });

    //Offcanvas Menu
    $(".canvas-open").on('click', function () {
        $(".offcanvas-menu-wrapper").addClass("show-offcanvas-menu-wrapper");
        $(".offcanvas-menu-overlay").addClass("active");
    });

    $(".canvas-close, .offcanvas-menu-overlay").on('click', function () {
        $(".offcanvas-menu-wrapper").removeClass("show-offcanvas-menu-wrapper");
        $(".offcanvas-menu-overlay").removeClass("active");
    });

    // Search model
    $('.search-switch').on('click', function () {
        $('.search-model').fadeIn(400);
    });

    $('.search-close-switch').on('click', function () {
        $('.search-model').fadeOut(400, function () {
            $('#search-input').val('');
        });
    });

    /*------------------
		Navigation
	--------------------*/
    $(".mobile-menu").slicknav({
        prependTo: '#mobile-menu-wrap',
        allowParentLinks: true
    });

    /*------------------
        Hero Slider
    --------------------*/
    $(document).ready(function(){
        $(".dropdown-number").hide(); // Ẩn dropdown ban đầu
    
        // Hiển thị dropdown khi focus vào input
        $("#room-guest").focus(function(){
            $(".dropdown-number").show();
        });
    
        // Ẩn dropdown khi click ra ngoài input và dropdown
        $(document).on('mousedown', function(e) {
            var container = $(".dropdown-number");
            if (!container.is(e.target) && container.has(e.target).length === 0) {
                container.hide();
            }
        });
    
        // Thêm phần phòng và khách khi nhấn nút "Thêm phòng khách"
        $(".addOptionRoom").on("click", function(){
            var roomOption = '<div class="room-option">' +
                                
                                '<div class="content-room-guest">' +
                                    '<span>Phòng</span>' +
                                    '<div class="adult-option">' +
                                        '<span>Người lớn:</span>' +
                                        '<select class="form-control input-sm sel-adult">' +
                                            '<option value="1">1 Người lớn</option>' +
                                            '<option value="2">2 Người lớn</option>' +
                                        '</select>' +
                                    '</div>' +
                                    '<div class="child-option">' +
                                        '<span>Trẻ em:</span>' +
                                        '<select class="form-control input-sm sel-child">' +
                                            '<option value="0">0 Trẻ em</option>' +
                                            '<option value="1">1 Trẻ em</option>' +
                                        '</select>' +
                                    '</div>' +
                                '</div>' +
                                '<div class="div-num-row">' +
                                    '<a class="d-num mrgt05 mrgb05 delOptionRoom">Xóa phòng</a>' +
                                '</div>' +
                            '</div>';
            $(".content-room-guest").append(roomOption);
        });
    
        // Xóa phần phòng và khách khi nhấn nút "Xóa phòng"
        $(document).on("click", ".delOptionRoom", function(){
            $(this).closest(".room-option").remove();
        });
        $('#date-in').datepicker({
            format: 'dd/mm/yyyy', // Định dạng ngày tháng
            autoclose: true, // Tự động đóng khi chọn xong
            todayHighlight: true // Highlight ngày hiện tại
        });
    
        // Kích hoạt datepicker cho input có id "date-out"
        $('#date-out').datepicker({
            format: 'dd/mm/yyyy', // Định dạng ngày tháng
            autoclose: true, // Tự động đóng khi chọn xong
            todayHighlight: true // Highlight ngày hiện tại
        });
    });
    
    
    /*------------------------
		Testimonial Slider
    ----------------------- */
    $(".testimonial-slider").owlCarousel({
        items: 1,
        dots: false,
        autoplay: true,
        loop: true,
        smartSpeed: 1200,
        nav: true,
        navText: ["<i class='arrow_left'></i>", "<i class='arrow_right'></i>"]
    });

    /*------------------
        Magnific Popup
    --------------------*/
    $('.video-popup').magnificPopup({
        type: 'iframe'
    });

    /*------------------
		Date Picker
	--------------------*/
    $(".date-input").datepicker({
        minDate: 0,
        dateFormat: 'dd MM, yy'
    });

    /*------------------
		Nice Select
	--------------------*/
    $("select").niceSelect();
    

})(jQuery);