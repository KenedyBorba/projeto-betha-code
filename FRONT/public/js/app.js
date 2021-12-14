angular
    .module("MyApp", ["ngRoute", "satellizer"])
    .config(function($routeProvider, $locationProvider, $authProvider) {
        $locationProvider.html5Mode(true);

        $routeProvider
        //login
            .when("/", {
                templateUrl: "partials/login.html",
                controller: "LoginCtrl"
            })
            .when("/login", {
                templateUrl: "partials/login.html",
                controller: "LoginCtrl"
            })
            //home
            .when("/home", {
                templateUrl: "partials/home.html",
            })
            //pessoaFisica
            .when("/pessoa-fisica", {
                templateUrl: "partials/pessoaFisica.html",
            })
            .when("/pessoa-fisica/:id", {
                templateUrl: "partials/pessoaFisica-form.html",
            })
            .when("/pessoa-fisica/new", {
                templateUrl: "partials/pessoaFisica-form.html",
            })
            //pessoaJuridica
            .when("/pessoa-juridica", {
                templateUrl: "partials/pessoaJuridica.html",
            })
            .when("/pessoa-juridica/:id", {
                templateUrl: "partials/pessoaJuridica-form.html",
            })
            .when("/pessoa-juridica/new", {
                templateUrl: "partials/pessoaJuridica-form.html",
            })
            //servico
            .when("/servico", {
                templateUrl: "partials/servico.html",
            })
            .when("/servico/:id", {
                templateUrl: "partials/servico-form.html",
            })
            .when("/servico/new", {
                templateUrl: "partials/servico-form.html",
            })
            //agendamento
            .when("/agenda", {
                templateUrl: "partials/agendamentos.html",
            })
            //404
            .otherwise({
                templateUrl: "partials/404.html",
            });
    })
    .run(function($rootScope, $window) {

    })
    .directive("ngConfirmClick", [
        function() {
            return {
                link: function(scope, element, attr) {
                    var msg = attr.ngConfirmClick || "Are you sure?";
                    var clickAction = attr.confirmedClick;
                    element.bind("click", function(event) {
                        if (window.confirm(msg)) {
                            scope.$eval(clickAction);
                        }
                    });
                },
            };
        },
    ]);