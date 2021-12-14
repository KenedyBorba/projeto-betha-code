(function() {
    "use strict";

    angular
        .module("MyApp")
        .controller("PessoaFisicaListController", PessoaFisicaListController);

        PessoaFisicaListController.$inject = ["PessoaFisicaService"];

    function PessoaFisicaListController(PessoaFisicaService) {
        var vm = this;

        vm.item = null;
        vm.itens = [];
        vm.busca = "";
        vm.remover = remover;
        vm.buscar = activate;

        activate();

        function activate() {
            var query = vm.busca ? { $text: { $search: vm.busca } } : {};
            PessoaFisicaService.find(query).then(function(result) {
                vm.itens = result.data;
            });
        }

        function remover(item) {
            PessoaFisicaService.remove(item.id).success(function() {
                activate();
            });
        }
    }
})();