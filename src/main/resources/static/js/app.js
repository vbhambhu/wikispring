alert(5);
$( "#createPost" ).click(function() {

    var formdata = $('#pageForm').serialize();

    console.log(formdata);


        $.post( "/api/page/create", formdata)
        .done(function( response ) {

            if(response.status){
               // window.location.replace("/page/"+response.message+"&edit=true");
            }

        });
});
