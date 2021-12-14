(function() {
    "use strict";

    angular
        .module("MyApp")
        .controller("PessoaJuridicaListController", PessoaJuridicaListController);

    PessoaJuridicaListController.$inject = ["PessoaJuridicaService"];

    function PessoaJuridicaListController(PessoaJuridicaService) {
        var vm = this;

        vm.item = null;
        vm.itens = [];
        vm.busca = "";
        vm.remover = remover;
        vm.buscar = activate;

        activate();

        function activate() {
            var query = vm.busca ? { $text: { $search: vm.busca } } : {};
            PessoaJuridicaService.find(query).then(function(result) {
                vm.itens = result.data;
            });
        }

        function remover(item) {
            PessoaJuridicaService.remove(item.id).success(function() {
                activate();
            });
        }
    }
})();