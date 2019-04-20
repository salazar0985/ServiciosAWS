function initSelect() {
    $(document).ready(function () {
        $('select').formSelect();
    });
};
function initFAB(){
    $(document).ready(function(){
        $('.fixed-action-btn').floatingActionButton({
        direction: 'left',
        hoverEnabled: false});
      });
}
