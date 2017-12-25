
$( "#createPost" ).click(function() {

    var title = $("#title").val();

    var slug = slugify(title);

        $.post( "/api/post/create", { title: title, slug: slug })
        .done(function( data ) {
            window.location.replace("/post/"+slug+"&edit=true");
        });

});

function slugify(text) {
    return text.toString().toLowerCase()
        .replace(/\s+/g, '-')           // Replace spaces with -
        .replace(/[^\w\-]+/g, '')       // Remove all non-word chars
        .replace(/\-\-+/g, '-')         // Replace multiple - with single -
        .replace(/^-+/, '')             // Trim - from start of text
        .replace(/-+$/, '');            // Trim - from end of text
}

