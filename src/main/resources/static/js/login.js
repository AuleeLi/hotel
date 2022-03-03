function changeColor(obj, bool) {
    if (bool) {
        $(obj).css("border", "2px solid #ffc300");
    } else {
        $(obj).css("border", "1px solid #676767");
    }
}