(function() {
    "use strict";

    angular.module("MyApp").controller("HomeController", HomeController);

    HomeController.$inject = ["$rootScope", "$location", "$window"];

    function HomeController($rootScope, $location, $window) {
        var vm = this;
        var itemSelecionado = -1;

        vm.pessoaFisicaPage = pessoaFisicaPage;
        vm.pessoaJuridicaPage = pessoaJuridicaPage;
        vm.servicoPage = servicoPage;
        vm.isAdministrador = isAdministrador;
        vm.agendamentosPage = agendamentosPage;

        activate();

        function activate() {}

        function isAdministrador() {
            return $window.localStorage.administrador;
        };

        function pessoaFisicaPage() {
            $location.path("/pessoa-fisica");
        }

        function pessoaJuridicaPage() {
            $location.path("/pessoa-juridica");
        }

        function servicoPage() {
            $location.path("/servico");
        }

        function agendamentosPage() {
            $location.path("/agenda");
        }

    }
})();